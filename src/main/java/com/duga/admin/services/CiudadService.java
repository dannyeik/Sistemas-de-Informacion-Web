package com.duga.admin.services;

import com.duga.admin.models.Ciudad;
import java.util.List;

public interface CiudadService {
    List<Ciudad> listar();
    Ciudad guardar(Ciudad ciudad);
    Ciudad buscarPorId(Long id);
    void eliminar(Long id);
}
