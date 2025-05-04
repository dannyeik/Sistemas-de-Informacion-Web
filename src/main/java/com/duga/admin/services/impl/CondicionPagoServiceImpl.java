package com.duga.admin.services.impl;

import com.duga.admin.models.CondicionPago;
import com.duga.admin.repositories.CondicionPagoRepository;
import com.duga.admin.services.CondicionPagoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CondicionPagoServiceImpl implements CondicionPagoService {

    private final CondicionPagoRepository repo;

    @Override
    public List<CondicionPago> getAll() {
        return (List<CondicionPago>) repo.findAll();
    }

    @Override
    public Optional<CondicionPago> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(CondicionPago condicion) {
        repo.save(condicion);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
