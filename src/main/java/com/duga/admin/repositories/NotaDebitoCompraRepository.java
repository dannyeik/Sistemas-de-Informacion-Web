package com.duga.admin.repositories;

import com.duga.admin.models.NotaDebitoCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaDebitoCompraRepository extends CrudRepository<NotaDebitoCompra, Long> {
}