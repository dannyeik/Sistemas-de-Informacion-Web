package com.duga.admin.services.impl;

import com.duga.admin.models.Proveedor;
import com.duga.admin.repositories.ProveedorRepository;
import com.duga.admin.services.ProveedorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository repo;

    @Override
    public List<Proveedor> getAll() {
        return (List<Proveedor>) repo.findAll();
    }

    @Override
    public Optional<Proveedor> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(Proveedor proveedor) {
        repo.save(proveedor);
    }

    @Override
    public void delete(Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
