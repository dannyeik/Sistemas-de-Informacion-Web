package com.duga.admin.services;

import com.duga.admin.models.Venta;
import java.util.List;
import java.util.Optional;

public interface VentaService {
    List<Venta> getAll();
    Optional<Venta> getById(Integer id);
    void save(Venta venta);
    void delete(Integer id);
}