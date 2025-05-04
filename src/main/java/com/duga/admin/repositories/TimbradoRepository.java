package com.duga.admin.repositories;

import com.duga.admin.models.Timbrado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimbradoRepository extends CrudRepository<Timbrado, Long> {
}
