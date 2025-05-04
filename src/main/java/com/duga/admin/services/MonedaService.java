package com.duga.admin.services;

import java.util.List;

import com.duga.admin.models.Moneda;

public interface MonedaService {
    List<Moneda> listar();
    Moneda guardar(Moneda moneda);
    Moneda obtenerPorId(Long id);
    void eliminar(Long id);
}
