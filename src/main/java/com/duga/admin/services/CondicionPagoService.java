package com.duga.admin.services;

import com.duga.admin.models.CondicionPago;
import java.util.List;
import java.util.Optional;

public interface CondicionPagoService {
    List<CondicionPago> getAll();
    Optional<CondicionPago> getById(Long id);
    void save(CondicionPago condicion);
    void delete(Long id);
}
