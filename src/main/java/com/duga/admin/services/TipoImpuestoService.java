package com.duga.admin.services;

import com.duga.admin.models.TipoImpuesto;
import java.util.List;
import java.util.Optional;

public interface TipoImpuestoService {
    List<TipoImpuesto> getAll();
    Optional<TipoImpuesto> getById(Long id);
    void save(TipoImpuesto tipoImpuesto);
    void delete(Long id);
}
