package com.duga.admin.services.impl;

import com.duga.admin.models.Mercaderia;
import com.duga.admin.repositories.MercaderiaRepository;
import com.duga.admin.services.MercaderiaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MercaderiaServiceImpl implements MercaderiaService {

    private final MercaderiaRepository repo;

    @Override
    public List<Mercaderia> getAll() {
        return (List<Mercaderia>) repo.findAll();
    }

    @Override
    public Optional<Mercaderia> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Mercaderia mercaderia) {
        repo.save(mercaderia);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
