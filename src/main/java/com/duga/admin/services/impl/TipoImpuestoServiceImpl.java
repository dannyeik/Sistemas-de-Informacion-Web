package com.duga.admin.services.impl;

import com.duga.admin.models.TipoImpuesto;
import com.duga.admin.repositories.TipoImpuestoRepository;
import com.duga.admin.services.TipoImpuestoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TipoImpuestoServiceImpl implements TipoImpuestoService {

    private final TipoImpuestoRepository repo;

    @Override
    public List<TipoImpuesto> getAll() {
        return (List<TipoImpuesto>) repo.findAll();
    }

    @Override
    public Optional<TipoImpuesto> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(TipoImpuesto tipoImpuesto) {
        repo.save(tipoImpuesto);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
