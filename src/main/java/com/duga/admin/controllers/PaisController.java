package com.duga.admin.controllers;

import com.duga.admin.models.Pais;
import com.duga.admin.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("paises", paisService.listar());
        return "paises/index";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("pais", new Pais());
        return "paises/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Pais pais) {
        paisService.guardar(pais);
        return "redirect:/paises";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("pais", paisService.buscarPorId(id));
        return "paises/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        paisService.eliminar(id);
        return "redirect:/paises";
    }
}
