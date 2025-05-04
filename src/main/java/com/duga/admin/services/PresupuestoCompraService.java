package com.duga.admin.services;

import com.duga.admin.models.PresupuestoCompra;

import java.util.List;
import java.util.Optional;

public interface PresupuestoCompraService {
    List<PresupuestoCompra> getAll();
    Optional<PresupuestoCompra> getById(Long id);
    void save(PresupuestoCompra presupuesto);
    void delete(Long id);
}
