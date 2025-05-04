package com.duga.admin.controllers;

import com.duga.admin.models.PresupuestoCompra;
import com.duga.admin.services.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/presupuestos")
@AllArgsConstructor
public class PresupuestoCompraController {

    private final PresupuestoCompraService presupuestoService;
    private final ProveedorService proveedorService;
    private final EmpleadosService empleadosService;
    private final SucursalesService sucursalesService;
    private final CondicionPagoService condicionPagoService;
    private final PedidoCompraService pedidoCompraService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("presupuestos", presupuestoService.getAll());
        return "presupuestos/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("presupuesto", new PresupuestoCompra());
        model.addAttribute("proveedores", proveedorService.getAll());
        model.addAttribute("empleados", empleadosService.getAll());
        model.addAttribute("sucursales", sucursalesService.getAlls());
        model.addAttribute("condiciones", condicionPagoService.getAll());
        model.addAttribute("pedidos", pedidoCompraService.getAll());
        return "presupuestos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute PresupuestoCompra presupuesto) {
        presupuestoService.save(presupuesto);
        return "redirect:/presupuestos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<PresupuestoCompra> presupuesto = presupuestoService.getById(id);
        if (presupuesto.isPresent()) {
            model.addAttribute("presupuesto", presupuesto.get());
            model.addAttribute("proveedores", proveedorService.getAll());
            model.addAttribute("empleados", empleadosService.getAll());
            model.addAttribute("sucursales", sucursalesService.getAlls());
            model.addAttribute("condiciones", condicionPagoService.getAll());
            model.addAttribute("pedidos", pedidoCompraService.getAll());
            return "presupuestos/formulario";
        }
        return "redirect:/presupuestos";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        presupuestoService.delete(id);
        return "redirect:/presupuestos";
    }
}
