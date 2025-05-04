package com.duga.admin.controllers;

import com.duga.admin.models.NotaCreditoCompra;
import com.duga.admin.services.NotaCreditoCompraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/nota-credito-compras")
@AllArgsConstructor
public class NotaCreditoCompraController {

    private final NotaCreditoCompraService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("notas", service.getAll());
        return "nota-credito/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("nota", new NotaCreditoCompra());
        return "nota-credito/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute NotaCreditoCompra nota) {
        service.save(nota);
        return "redirect:/nota-credito-compras";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<NotaCreditoCompra> nota = service.getById(id);
        if (nota.isPresent()) {
            model.addAttribute("nota", nota.get());
            return "nota-credito/formulario";
        }
        return "redirect:/nota-credito-compras";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/nota-credito-compras";
    }
}