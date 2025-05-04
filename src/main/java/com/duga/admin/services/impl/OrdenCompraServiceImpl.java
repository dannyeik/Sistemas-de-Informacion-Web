package com.duga.admin.services.impl;

import com.duga.admin.models.OrdenCompra;
import com.duga.admin.repositories.OrdenCompraRepository;
import com.duga.admin.services.OrdenCompraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrdenCompraServiceImpl implements OrdenCompraService {

    private final OrdenCompraRepository repository;

    @Override
    public List<OrdenCompra> getAll() {
        return (List<OrdenCompra>) repository.findAll();
    }

    @Override
    public Optional<OrdenCompra> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(OrdenCompra ordenCompra) {
        repository.save(ordenCompra);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
