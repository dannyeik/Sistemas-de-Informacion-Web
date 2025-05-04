package com.duga.admin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duga.admin.models.Roles;

@Repository
public interface RolesRepository extends CrudRepository<Roles, Long> {

	@Query("SELECT u from Roles u")
	List<Roles> findByAll();
}
