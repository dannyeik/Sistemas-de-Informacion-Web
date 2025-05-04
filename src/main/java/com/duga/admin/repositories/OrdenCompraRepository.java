package com.duga.admin.repositories;

import com.duga.admin.models.OrdenCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenCompraRepository extends CrudRepository<OrdenCompra, Long> {
}
