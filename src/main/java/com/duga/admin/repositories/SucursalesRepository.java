/**
 * 
 */
package com.duga.admin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duga.admin.models.Sucursales;

/**
 * 
 */
@Repository
public interface SucursalesRepository extends CrudRepository<Sucursales, Long> {

	@Query("SELECT s from Sucursales s")
	List<Sucursales> findByAll();
}
