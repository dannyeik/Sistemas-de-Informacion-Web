package com.duga.admin.repositories;

import com.duga.admin.models.TipoImpuesto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoImpuestoRepository extends CrudRepository<TipoImpuesto, Long> {
}
