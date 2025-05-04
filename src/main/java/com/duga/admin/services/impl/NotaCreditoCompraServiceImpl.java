package com.duga.admin.services.impl;

import com.duga.admin.models.NotaCreditoCompra;
import com.duga.admin.repositories.NotaCreditoCompraRepository;
import com.duga.admin.services.NotaCreditoCompraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NotaCreditoCompraServiceImpl implements NotaCreditoCompraService {

    private final NotaCreditoCompraRepository repository;

    @Override
    public List<NotaCreditoCompra> getAll() {
        return (List<NotaCreditoCompra>) repository.findAll();
    }

    @Override
    public Optional<NotaCreditoCompra> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(NotaCreditoCompra nota) {
        repository.save(nota);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}