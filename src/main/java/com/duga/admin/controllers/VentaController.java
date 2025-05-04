package com.duga.admin.controllers;

import com.duga.admin.models.Venta;
import com.duga.admin.services.VentaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/ventas")
@AllArgsConstructor
public class VentaController {

    private final VentaService ventaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("ventas", ventaService.getAll());
        return "ventas/listar";
    }

    @GetMapping("/form")
    public String formulario(Model model) {
        model.addAttribute("venta", new Venta());
        return "ventas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Venta venta) {
        ventaService.save(venta);
        return "redirect:/ventas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Optional<Venta> venta = ventaService.getById(id);
        if (venta.isPresent()) {
            model.addAttribute("venta", venta.get());
            return "ventas/formulario";
        }
        return "redirect:/ventas";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Integer id) {
        ventaService.delete(id);
        return "redirect:/ventas";
    }
}