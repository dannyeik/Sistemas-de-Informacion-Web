package com.duga.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duga.admin.models.Moneda;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {
}
