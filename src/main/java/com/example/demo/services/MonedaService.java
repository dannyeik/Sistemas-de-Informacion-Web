package com.example.demo.services;

import com.example.demo.models.Moneda;
import java.util.List;

public interface MonedaService {
    List<Moneda> listar();
    Moneda guardar(Moneda moneda);
    Moneda obtenerPorId(Long id);
    void eliminar(Long id);
}
