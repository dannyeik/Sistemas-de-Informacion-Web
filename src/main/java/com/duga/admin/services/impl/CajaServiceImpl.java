package com.duga.admin.services.impl;

import com.duga.admin.models.Caja;
import com.duga.admin.repositories.CajaRepository;
import com.duga.admin.services.CajaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CajaServiceImpl implements CajaService {

    private final CajaRepository repo;

    @Override
    public List<Caja> getAll() {
        return (List<Caja>) repo.findAll();
    }

    @Override
    public Optional<Caja> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Caja caja) {
        repo.save(caja);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
