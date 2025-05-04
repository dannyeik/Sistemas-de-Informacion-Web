package com.duga.admin.services;

import com.duga.admin.models.Mercaderia;
import java.util.List;
import java.util.Optional;

public interface MercaderiaService {
    List<Mercaderia> getAll();
    Optional<Mercaderia> getById(Long id);
    void save(Mercaderia mercaderia);
    void delete(Long id);
}
