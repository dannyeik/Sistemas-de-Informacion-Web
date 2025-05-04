package com.duga.admin.controllers;

import com.duga.admin.models.Empleados;
import com.duga.admin.services.EmpleadosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/empleados")
@AllArgsConstructor
public class EmpleadosController {

    private final EmpleadosService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("empleados", service.getAll());
        return "empleados/listar";
    }

    @GetMapping("/form")
    public String nuevo(Model model) {
        model.addAttribute("empleado", new Empleados());
        return "empleados/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Empleados empleado) {
        service.save(empleado);
        return "redirect:/empleados";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Empleados> empleado = service.getById(id);
        if (empleado.isPresent()) {
            model.addAttribute("empleado", empleado.get());
            return "empleados/formulario";
        }
        return "redirect:/empleados";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        service.delete(id);
        return "redirect:/empleados";
    }
}
