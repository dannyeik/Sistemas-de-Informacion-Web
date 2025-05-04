package com.duga.admin.controllers;

import com.duga.admin.models.Cobro;
import com.duga.admin.services.CobroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/cobros")
@AllArgsConstructor
public class CobroController {

    private final CobroService cobroService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cobros", cobroService.getAll());
        return "cobros/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("cobro", new Cobro());
        return "cobros/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Cobro cobro) {
        cobroService.save(cobro);
        return "redirect:/cobros";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Cobro> cobro = cobroService.getById(id);
        if (cobro.isPresent()) {
            model.addAttribute("cobro", cobro.get());
            return "cobros/formulario";
        }
        return "redirect:/cobros";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        cobroService.delete(id);
        return "redirect:/cobros";
    }
}