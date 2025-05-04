package com.duga.admin.repositories;

import com.duga.admin.models.CondicionPago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionPagoRepository extends CrudRepository<CondicionPago, Long> {
}
