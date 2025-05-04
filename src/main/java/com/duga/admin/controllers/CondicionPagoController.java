package com.duga.admin.controllers;

import com.duga.admin.models.CondicionPago;
import com.duga.admin.services.CondicionPagoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/condiciones")
@AllArgsConstructor
public class CondicionPagoController {

    private final CondicionPagoService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("condiciones", service.getAll());
        return "condiciones/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("condicion", new CondicionPago());
        return "condiciones/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute CondicionPago condicion) {
        service.save(condicion);
        return "redirect:/condiciones";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<CondicionPago> condicion = service.getById(id);
        if (condicion.isPresent()) {
            model.addAttribute("condicion", condicion.get());
            return "condiciones/formulario";
        }
        return "redirect:/condiciones";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/condiciones";
    }
}
