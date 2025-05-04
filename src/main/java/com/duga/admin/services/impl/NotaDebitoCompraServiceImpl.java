package com.duga.admin.services.impl;

import com.duga.admin.models.NotaDebitoCompra;
import com.duga.admin.repositories.NotaDebitoCompraRepository;
import com.duga.admin.services.NotaDebitoCompraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NotaDebitoCompraServiceImpl implements NotaDebitoCompraService {

    private final NotaDebitoCompraRepository repository;

    @Override
    public List<NotaDebitoCompra> getAll() {
        return (List<NotaDebitoCompra>) repository.findAll();
    }

    @Override
    public Optional<NotaDebitoCompra> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(NotaDebitoCompra nota) {
        repository.save(nota);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}