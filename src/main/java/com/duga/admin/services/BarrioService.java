package com.duga.admin.services;

import com.duga.admin.models.Barrio;
import java.util.List;

public interface BarrioService {
    List<Barrio> listar();
    Barrio guardar(Barrio barrio);
    Barrio buscarPorId(Long id);
    void eliminar(Long id);
}
