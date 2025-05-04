package com.duga.admin.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duga.admin.models.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Long> {

	Optional<Usuarios> findByUsername(String username);

	@Query("SELECT u from Usuarios u")
	List<Usuarios> findByAll();
}
