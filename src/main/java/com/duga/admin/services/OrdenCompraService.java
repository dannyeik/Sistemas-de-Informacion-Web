package com.duga.admin.services;

import com.duga.admin.models.OrdenCompra;

import java.util.List;
import java.util.Optional;

public interface OrdenCompraService {
    List<OrdenCompra> getAll();
    Optional<OrdenCompra> getById(Long id);
    void save(OrdenCompra ordenCompra);
    void delete(Long id);
}
