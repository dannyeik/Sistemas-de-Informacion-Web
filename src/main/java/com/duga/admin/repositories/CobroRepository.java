package com.duga.admin.repositories;

import com.duga.admin.models.Cobro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobroRepository extends CrudRepository<Cobro, Long> {
}