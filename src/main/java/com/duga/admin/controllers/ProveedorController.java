package com.duga.admin.controllers;

import com.duga.admin.models.Proveedor;
import com.duga.admin.services.ProveedorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/proveedores")
@AllArgsConstructor
public class ProveedorController {

    private final ProveedorService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("proveedores", service.getAll());
        return "proveedores/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("proveedor", new Proveedor());
        return "proveedores/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Proveedor proveedor) {
        service.save(proveedor);
        return "redirect:/proveedores";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Proveedor> proveedor = service.getById(id);
        if (proveedor.isPresent()) {
            model.addAttribute("proveedor", proveedor.get());
            return "proveedores/formulario";
        }
        return "redirect:/proveedores";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/proveedores";
    }
}
