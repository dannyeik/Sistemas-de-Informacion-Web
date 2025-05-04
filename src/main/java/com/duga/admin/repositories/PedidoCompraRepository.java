package com.duga.admin.repositories;

import com.duga.admin.models.PedidoCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoCompraRepository extends CrudRepository<PedidoCompra, Long> {
}
