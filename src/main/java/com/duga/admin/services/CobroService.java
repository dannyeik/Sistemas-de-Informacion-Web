package com.duga.admin.services;

import com.duga.admin.models.Cobro;
import java.util.List;
import java.util.Optional;

public interface CobroService {
    List<Cobro> getAll();
    Optional<Cobro> getById(Long id);
    void save(Cobro cobro);
    void delete(Long id);
}