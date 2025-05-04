package com.duga.admin.controllers;

import com.duga.admin.models.Mercaderia;
import com.duga.admin.services.MercaderiaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/mercaderias")
@AllArgsConstructor
public class MercaderiaController {

    private final MercaderiaService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("mercaderias", service.getAll());
        return "mercaderias/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("mercaderia", new Mercaderia());
        return "mercaderias/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Mercaderia mercaderia) {
        service.save(mercaderia);
        return "redirect:/mercaderias";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Mercaderia> mercaderia = service.getById(id);
        if (mercaderia.isPresent()) {
            model.addAttribute("mercaderia", mercaderia.get());
            return "mercaderias/formulario";
        }
        return "redirect:/mercaderias";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/mercaderias";
    }
}
