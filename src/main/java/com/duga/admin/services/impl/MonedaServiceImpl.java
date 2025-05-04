package com.duga.admin.services.impl;

import com.duga.admin.models.Moneda;
import com.duga.admin.repositories.MonedaRepository;
import com.duga.admin.services.MonedaService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MonedaServiceImpl implements MonedaService {

    private final MonedaRepository monedaRepository;

    public MonedaServiceImpl(MonedaRepository monedaRepository) {
        this.monedaRepository = monedaRepository;
    }

    @Override
    public List<Moneda> listar() {
        return monedaRepository.findAll();
    }

    @Override
    public Moneda guardar(Moneda moneda) {
        return monedaRepository.save(moneda);
    }

    @Override
    public Moneda obtenerPorId(Long id) {
        return monedaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        monedaRepository.deleteById(id);
    }
}
