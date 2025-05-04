package com.duga.admin.controllers;

import com.duga.admin.models.OrdenCompra;
import com.duga.admin.services.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/ordenes")
@AllArgsConstructor
public class OrdenCompraController {

    private final OrdenCompraService ordenService;
    private final ProveedorService proveedorService;
    private final EmpleadosService empleadosService;
    private final SucursalesService sucursalesService;
    private final CondicionPagoService condicionPagoService;
    private final PresupuestoCompraService presupuestoCompraService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("ordenes", ordenService.getAll());
        return "ordenes/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("orden", new OrdenCompra());
        model.addAttribute("proveedores", proveedorService.getAll());
        model.addAttribute("empleados", empleadosService.getAll());
        model.addAttribute("sucursales", sucursalesService.getAlls());
        model.addAttribute("condiciones", condicionPagoService.getAll());
        model.addAttribute("presupuestos", presupuestoCompraService.getAll());
        return "ordenes/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute OrdenCompra orden) {
        ordenService.save(orden);
        return "redirect:/ordenes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<OrdenCompra> orden = ordenService.getById(id);
        if (orden.isPresent()) {
            model.addAttribute("orden", orden.get());
            model.addAttribute("proveedores", proveedorService.getAll());
            model.addAttribute("empleados", empleadosService.getAll());
            model.addAttribute("sucursales", sucursalesService.getAlls());
            model.addAttribute("condiciones", condicionPagoService.getAll());
            model.addAttribute("presupuestos", presupuestoCompraService.getAll());
            return "ordenes/formulario";
        }
        return "redirect:/ordenes";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        ordenService.delete(id);
        return "redirect:/ordenes";
    }
}
