package com.example.demo.controllers;

import com.example.demo.models.Banco;
import com.example.demo.services.BancoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bancos")
public class BancoController {

    private final BancoService bancoService;

    public BancoController(BancoService bancoService) {
        this.bancoService = bancoService;
    }

    @GetMapping
    public String listar(Model modelo) {
        modelo.addAttribute("bancos", bancoService.listar());
        return "bancos/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model modelo) {
        modelo.addAttribute("banco", new Banco());
        return "bancos/formulario";
    }

    @PostMapping
    public String guardar(@ModelAttribute Banco banco) {
        bancoService.guardar(banco);
        return "redirect:/bancos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("banco", bancoService.obtenerPorId(id));
        return "bancos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        bancoService.eliminar(id);
        return "redirect:/bancos";
    }
}
