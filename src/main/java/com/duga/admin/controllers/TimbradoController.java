package com.duga.admin.controllers;

import com.duga.admin.models.Timbrado;
import com.duga.admin.services.TimbradoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/timbrados")
@AllArgsConstructor
public class TimbradoController {

    private final TimbradoService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("timbrados", service.getAll());
        return "timbrados/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("timbrado", new Timbrado());
        return "timbrados/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Timbrado timbrado) {
        service.save(timbrado);
        return "redirect:/timbrados";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Timbrado> t = service.getById(id);
        if (t.isPresent()) {
            model.addAttribute("timbrado", t.get());
            return "timbrados/formulario";
        }
        return "redirect:/timbrados";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/timbrados";
    }
}
