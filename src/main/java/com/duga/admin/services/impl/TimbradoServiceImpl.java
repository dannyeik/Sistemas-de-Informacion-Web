package com.duga.admin.services.impl;

import com.duga.admin.models.Timbrado;
import com.duga.admin.repositories.TimbradoRepository;
import com.duga.admin.services.TimbradoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TimbradoServiceImpl implements TimbradoService {

    private final TimbradoRepository repo;

    @Override
    public List<Timbrado> getAll() {
        return (List<Timbrado>) repo.findAll();
    }

    @Override
    public Optional<Timbrado> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Timbrado timbrado) {
        repo.save(timbrado);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
