package com.duga.admin.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.duga.admin.models.Sucursales;
import com.duga.admin.repositories.SucursalesRepository;
import com.duga.admin.services.SucursalesService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SucursalesServiceImpl implements SucursalesService {

	private final SucursalesRepository repository;

	@Override
	public List<Sucursales> getAlls() {

		return repository.findByAll();
	}

	@Override
	public Optional<Sucursales> getById(Long id) {

		return repository.findById(id);
	}

	@Override
	public void save(Sucursales rol) {
		this.repository.save(rol);
	}

	@Override
	public void delete(Long id) {

		if (Objects.nonNull(id)) {
			this.repository.findById(id).ifPresent(rol -> this.repository.delete(rol));
		}
	}

}
