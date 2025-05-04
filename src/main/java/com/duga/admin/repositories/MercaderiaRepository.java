package com.duga.admin.repositories;

import com.duga.admin.models.Mercaderia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercaderiaRepository extends CrudRepository<Mercaderia, Long> {
}
