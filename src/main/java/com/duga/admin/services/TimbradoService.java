package com.duga.admin.services;

import com.duga.admin.models.Timbrado;
import java.util.List;
import java.util.Optional;

public interface TimbradoService {
    List<Timbrado> getAll();
    Optional<Timbrado> getById(Long id);
    void save(Timbrado timbrado);
    void delete(Long id);
}
