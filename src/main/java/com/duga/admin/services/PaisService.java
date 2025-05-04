package com.duga.admin.services;

import com.duga.admin.models.Pais;
import java.util.List;

public interface PaisService {
    List<Pais> listar();
    Pais guardar(Pais pais);
    Pais buscarPorId(Long id);
    void eliminar(Long id);
}
