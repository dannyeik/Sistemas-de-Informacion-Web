package com.duga.admin.repositories;

import com.duga.admin.models.Caja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CajaRepository extends CrudRepository<Caja, Long> {
}
