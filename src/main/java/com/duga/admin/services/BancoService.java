package com.duga.admin.services;

import java.util.List;

import com.duga.admin.models.Banco;

public interface BancoService {
    List<Banco> listar();
    Banco guardar(Banco banco);
    Banco obtenerPorId(Long id);
    void eliminar(Long id);
}
