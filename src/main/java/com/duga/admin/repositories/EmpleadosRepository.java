package com.duga.admin.repositories;

import com.duga.admin.models.Empleados;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadosRepository extends CrudRepository<Empleados, Long> {
}
