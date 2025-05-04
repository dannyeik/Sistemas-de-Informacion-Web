package com.duga.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duga.admin.models.Banco;

public interface BancoRepository extends JpaRepository<Banco, Long> {
}
