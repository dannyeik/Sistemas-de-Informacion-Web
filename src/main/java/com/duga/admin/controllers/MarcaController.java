package com.duga.admin.controllers;

import com.duga.admin.models.Marca;
import com.duga.admin.services.MarcaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/marcas")
@AllArgsConstructor
public class MarcaController {

    private final MarcaService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("marcas", service.getAll());
        return "marcas/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("marca", new Marca());
        return "marcas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Marca marca) {
        service.save(marca);
        return "redirect:/marcas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Marca> marca = service.getById(id);
        if (marca.isPresent()) {
            model.addAttribute("marca", marca.get());
            return "marcas/formulario";
        }
        return "redirect:/marcas";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/marcas";
    }
}
