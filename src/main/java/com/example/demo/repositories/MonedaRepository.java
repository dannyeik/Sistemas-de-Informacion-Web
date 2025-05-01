package com.example.demo.repositories;

import com.example.demo.models.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {
}
