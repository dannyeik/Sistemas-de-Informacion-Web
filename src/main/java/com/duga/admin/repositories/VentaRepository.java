package com.duga.admin.repositories;

import com.duga.admin.models.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Integer> {
    List<Venta> findAll();
}