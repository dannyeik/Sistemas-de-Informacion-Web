package com.duga.admin.services;

import com.duga.admin.models.NotaDebitoCompra;
import java.util.List;
import java.util.Optional;

public interface NotaDebitoCompraService {
    List<NotaDebitoCompra> getAll();
    Optional<NotaDebitoCompra> getById(Long id);
    void save(NotaDebitoCompra nota);
    void delete(Long id);
}