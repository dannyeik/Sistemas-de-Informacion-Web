package com.duga.admin.controllers;

import com.duga.admin.models.Caja;
import com.duga.admin.services.CajaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/cajas")
@AllArgsConstructor
public class CajaController {

    private final CajaService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cajas", service.getAll());
        return "cajas/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("caja", new Caja());
        return "cajas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Caja caja) {
        service.save(caja);
        return "redirect:/cajas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Caja> caja = service.getById(id);
        if (caja.isPresent()) {
            model.addAttribute("caja", caja.get());
            return "cajas/formulario";
        }
        return "redirect:/cajas";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/cajas";
    }
}
