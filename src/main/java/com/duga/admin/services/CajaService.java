package com.duga.admin.services;

import com.duga.admin.models.Caja;
import java.util.List;
import java.util.Optional;

public interface CajaService {
    List<Caja> getAll();
    Optional<Caja> getById(Long id);
    void save(Caja caja);
    void delete(Long id);
}
