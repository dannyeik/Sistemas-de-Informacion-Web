package com.duga.admin.controllers;

import com.duga.admin.models.NotaDebitoCompra;
import com.duga.admin.services.NotaDebitoCompraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/nota-debito-compras")
@AllArgsConstructor
public class NotaDebitoCompraController {

    private final NotaDebitoCompraService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("notas", service.getAll());
        return "nota-debito/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("nota", new NotaDebitoCompra());
        return "nota-debito/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute NotaDebitoCompra nota) {
        service.save(nota);
        return "redirect:/nota-debito-compras";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<NotaDebitoCompra> nota = service.getById(id);
        if (nota.isPresent()) {
            model.addAttribute("nota", nota.get());
            return "nota-debito/formulario";
        }
        return "redirect:/nota-debito-compras";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/nota-debito-compras";
    }
}