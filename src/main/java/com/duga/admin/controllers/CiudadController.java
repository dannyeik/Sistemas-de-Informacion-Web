package com.duga.admin.controllers;

import com.duga.admin.models.Ciudad;
import com.duga.admin.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ciudades")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("ciudades", ciudadService.listar());
        return "ciudades/index";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("ciudad", new Ciudad());
        return "ciudades/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Ciudad ciudad) {
        ciudadService.guardar(ciudad);
        return "redirect:/ciudades";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("ciudad", ciudadService.buscarPorId(id));
        return "ciudades/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        ciudadService.eliminar(id);
        return "redirect:/ciudades";
    }
}
