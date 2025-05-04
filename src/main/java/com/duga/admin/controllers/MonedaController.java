package com.duga.admin.controllers;

import com.duga.admin.models.Moneda;
import com.duga.admin.services.MonedaService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/monedas")
public class MonedaController {

    private final MonedaService monedaService;

    public MonedaController(MonedaService monedaService) {
        this.monedaService = monedaService;
    }

    @GetMapping
    public String listar(Model modelo) {
        modelo.addAttribute("monedas", monedaService.listar());
        return "monedas/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model modelo) {
        modelo.addAttribute("moneda", new Moneda());
        return "monedas/formulario";
    }

    @PostMapping
    public String guardar(@ModelAttribute Moneda moneda) {
        monedaService.guardar(moneda);
        return "redirect:/monedas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("moneda", monedaService.obtenerPorId(id));
        return "monedas/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        monedaService.eliminar(id);
        return "redirect:/monedas";
    }
}
