package com.duga.admin.services.impl;

import com.duga.admin.models.Cobro;
import com.duga.admin.repositories.CobroRepository;
import com.duga.admin.services.CobroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CobroServiceImpl implements CobroService {

    private final CobroRepository cobroRepository;

    @Override
    public List<Cobro> getAll() {
        return (List<Cobro>) cobroRepository.findAll();
    }

    @Override
    public Optional<Cobro> getById(Long id) {
        return cobroRepository.findById(id);
    }

    @Override
    public void save(Cobro cobro) {
        cobroRepository.save(cobro);
    }

    @Override
    public void delete(Long id) {
        cobroRepository.deleteById(id);
    }
}