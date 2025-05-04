package com.duga.admin.services.impl;

import com.duga.admin.models.Cliente;
import com.duga.admin.repositories.ClienteRepository;
import com.duga.admin.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repo;

    @Override
    public List<Cliente> getAll() {
        return (List<Cliente>) repo.findAll();
    }

    @Override
    public Optional<Cliente> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Cliente cliente) {
        repo.save(cliente);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
