package com.example.demo.services.impl;

import com.example.demo.models.Banco;
import com.example.demo.repositories.BancoRepository;
import com.example.demo.services.BancoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoServiceImpl implements BancoService {

    private final BancoRepository bancoRepository;

    public BancoServiceImpl(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    @Override
    public List<Banco> listar() {
        return bancoRepository.findAll();
    }

    @Override
    public Banco guardar(Banco banco) {
        return bancoRepository.save(banco);
    }

    @Override
    public Banco obtenerPorId(Long id) {
        return bancoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        bancoRepository.deleteById(id);
    }
}
