package com.duga.admin.services;

import com.duga.admin.models.NotaCreditoCompra;
import java.util.List;
import java.util.Optional;

public interface NotaCreditoCompraService {
    List<NotaCreditoCompra> getAll();
    Optional<NotaCreditoCompra> getById(Long id);
    void save(NotaCreditoCompra nota);
    void delete(Long id);
}