package com.duga.admin.services.impl;

import com.duga.admin.models.Venta;
import com.duga.admin.repositories.VentaRepository;
import com.duga.admin.services.VentaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VentaServiceImpl implements VentaService {

    private final VentaRepository repository;

    @Override
    public List<Venta> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Venta> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Venta venta) {
        repository.save(venta);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
