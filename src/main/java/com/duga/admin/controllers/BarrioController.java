package com.duga.admin.controllers;

import com.duga.admin.models.Barrio;
import com.duga.admin.services.BarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/barrios")
public class BarrioController {

    @Autowired
    private BarrioService barrioService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("barrios", barrioService.listar());
        return "barrios/index";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("barrio", new Barrio());
        return "barrios/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Barrio barrio) {
        barrioService.guardar(barrio);
        return "redirect:/barrios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("barrio", barrioService.buscarPorId(id));
        return "barrios/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        barrioService.eliminar(id);
        return "redirect:/barrios";
    }
}
