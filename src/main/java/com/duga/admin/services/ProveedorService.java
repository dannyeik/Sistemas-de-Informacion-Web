package com.duga.admin.services;

import com.duga.admin.models.Proveedor;
import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    List<Proveedor> getAll();
    Optional<Proveedor> getById(Long id);
    void save(Proveedor proveedor);
    void delete(Long id);
}
