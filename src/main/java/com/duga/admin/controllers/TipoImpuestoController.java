package com.duga.admin.controllers;

import com.duga.admin.models.TipoImpuesto;
import com.duga.admin.services.TipoImpuestoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/tipo-impuesto")
@AllArgsConstructor
public class TipoImpuestoController {

    private final TipoImpuestoService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tipos", service.getAll());
        return "tipo-impuesto/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("tipo", new TipoImpuesto());
        return "tipo-impuesto/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute TipoImpuesto tipo) {
        service.save(tipo);
        return "redirect:/tipo-impuesto";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<TipoImpuesto> tipo = service.getById(id);
        if (tipo.isPresent()) {
            model.addAttribute("tipo", tipo.get());
            return "tipo-impuesto/formulario";
        }
        return "redirect:/tipo-impuesto";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/tipo-impuesto";
    }
}
