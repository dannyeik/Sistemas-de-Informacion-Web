package com.duga.admin.services.impl;

import com.duga.admin.models.PedidoCompra;
import com.duga.admin.repositories.PedidoCompraRepository;
import com.duga.admin.services.PedidoCompraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PedidoCompraServiceImpl implements PedidoCompraService {

    private final PedidoCompraRepository repo;

    @Override
    public List<PedidoCompra> getAll() {
        return (List<PedidoCompra>) repo.findAll();
    }

    @Override
    public Optional<PedidoCompra> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(PedidoCompra pedido) {
        repo.save(pedido);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
