package com.duga.admin.services.impl;

import com.duga.admin.models.Ciudad;
import com.duga.admin.repositories.CiudadRepository;
import com.duga.admin.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> listar() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad guardar(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public Ciudad buscarPorId(Long id) {
        return ciudadRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        ciudadRepository.deleteById(id);
    }
}
