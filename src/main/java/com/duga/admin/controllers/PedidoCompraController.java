package com.duga.admin.controllers;

import com.duga.admin.models.PedidoCompra;
import com.duga.admin.services.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/pedidos")
@AllArgsConstructor
public class PedidoCompraController {

    private final PedidoCompraService pedidoService;
    private final ProveedorService proveedorService;
    private final EmpleadosService empleadosService;
    private final SucursalesService sucursalesService;
    private final CondicionPagoService condicionPagoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pedidos", pedidoService.getAll());
        return "pedidos/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("pedido", new PedidoCompra());
        model.addAttribute("proveedores", proveedorService.getAll());
        model.addAttribute("empleados", empleadosService.getAll());
        model.addAttribute("sucursales", sucursalesService.getAlls());
        model.addAttribute("condiciones", condicionPagoService.getAll());
        return "pedidos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute PedidoCompra pedido) {
        pedidoService.save(pedido);
        return "redirect:/pedidos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<PedidoCompra> pedido = pedidoService.getById(id);
        if (pedido.isPresent()) {
            model.addAttribute("pedido", pedido.get());
            model.addAttribute("proveedores", proveedorService.getAll());
            model.addAttribute("empleados", empleadosService.getAll());
            model.addAttribute("sucursales", sucursalesService.getAlls());
            model.addAttribute("condiciones", condicionPagoService.getAll());
            return "pedidos/formulario";
        }
        return "redirect:/pedidos";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        pedidoService.delete(id);
        return "redirect:/pedidos";
    }
}
