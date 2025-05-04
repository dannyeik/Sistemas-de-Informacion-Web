package com.duga.admin.services;

import com.duga.admin.models.PedidoCompra;
import java.util.List;
import java.util.Optional;

public interface PedidoCompraService {
    List<PedidoCompra> getAll();
    Optional<PedidoCompra> getById(Long id);
    void save(PedidoCompra pedido);
    void delete(Long id);
}
