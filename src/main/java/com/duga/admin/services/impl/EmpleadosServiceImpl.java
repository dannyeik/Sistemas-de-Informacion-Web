package com.duga.admin.services.impl;

import com.duga.admin.models.Empleados;
import com.duga.admin.repositories.EmpleadosRepository;
import com.duga.admin.services.EmpleadosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmpleadosServiceImpl implements EmpleadosService {

    private final EmpleadosRepository repo;

    @Override
    public List<Empleados> getAll() {
        return (List<Empleados>) repo.findAll();
    }

    @Override
    public Optional<Empleados> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Empleados empleado) {
        repo.save(empleado);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
