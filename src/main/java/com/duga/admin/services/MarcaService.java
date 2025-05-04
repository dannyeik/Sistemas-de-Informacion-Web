package com.duga.admin.services;

import com.duga.admin.models.Marca;
import java.util.List;
import java.util.Optional;

public interface MarcaService {
    List<Marca> getAll();
    Optional<Marca> getById(Long id);
    void save(Marca marca);
    void delete(Long id);
}
