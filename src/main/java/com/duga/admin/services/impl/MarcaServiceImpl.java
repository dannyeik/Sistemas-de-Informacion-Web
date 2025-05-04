package com.duga.admin.services.impl;

import com.duga.admin.models.Marca;
import com.duga.admin.repositories.MarcaRepository;
import com.duga.admin.services.MarcaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository repo;

    @Override
    public List<Marca> getAll() {
        return (List<Marca>) repo.findAll();
    }

    @Override
    public Optional<Marca> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Marca marca) {
        repo.save(marca);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
