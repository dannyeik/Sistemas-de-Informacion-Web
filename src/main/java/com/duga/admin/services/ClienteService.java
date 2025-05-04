package com.duga.admin.services;

import com.duga.admin.models.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> getAll();
    Optional<Cliente> getById(Long id);
    void save(Cliente cliente);
    void delete(Long id);
}
