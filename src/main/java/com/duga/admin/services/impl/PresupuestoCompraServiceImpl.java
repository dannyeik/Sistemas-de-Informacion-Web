package com.duga.admin.services.impl;

import com.duga.admin.models.PresupuestoCompra;
import com.duga.admin.repositories.PresupuestoCompraRepository;
import com.duga.admin.services.PresupuestoCompraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PresupuestoCompraServiceImpl implements PresupuestoCompraService {

    private final PresupuestoCompraRepository repo;

    @Override
    public List<PresupuestoCompra> getAll() {
        return (List<PresupuestoCompra>) repo.findAll();
    }

    @Override
    public Optional<PresupuestoCompra> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(PresupuestoCompra presupuesto) {
        repo.save(presupuesto);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
