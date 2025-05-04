package com.duga.admin.repositories;

import com.duga.admin.models.NotaCreditoCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaCreditoCompraRepository extends CrudRepository<NotaCreditoCompra, Long> {
}