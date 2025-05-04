package com.duga.admin.services.impl;

import com.duga.admin.models.Barrio;
import com.duga.admin.repositories.BarrioRepository;
import com.duga.admin.services.BarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarrioServiceImpl implements BarrioService {

    @Autowired
    private BarrioRepository barrioRepository;

    @Override
    public List<Barrio> listar() {
        return barrioRepository.findAll();
    }

    @Override
    public Barrio guardar(Barrio barrio) {
        return barrioRepository.save(barrio);
    }

    @Override
    public Barrio buscarPorId(Long id) {
        return barrioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        barrioRepository.deleteById(id);
    }
}
