package com.duga.admin.services;

import com.duga.admin.models.Empleados;
import java.util.List;
import java.util.Optional;

public interface EmpleadosService {
    List<Empleados> getAll();
    Optional<Empleados> getById(Long id);
    void save(Empleados empleado);
    void delete(Long id);
}
