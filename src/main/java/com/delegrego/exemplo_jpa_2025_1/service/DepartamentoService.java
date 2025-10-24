package com.delegrego.exemplo_jpa_2025_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_jpa_2025_1.dto.DepartamentoDto;
import com.delegrego.exemplo_jpa_2025_1.entity.DepartamentoEntity;
import com.delegrego.exemplo_jpa_2025_1.repo.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	@Autowired
	private DepartamentoRepository departamentoRepo;
	

	// CRUD

	// Create
	public void cadastrarDepartamento(DepartamentoDto departamentoDto) {
		
		DepartamentoEntity departamentoEntity = new DepartamentoEntity();
		
		departamentoEntity.setNmDepartamento(departamentoDto.getNmDepartamento());
		
		departamentoRepo.save(departamentoEntity);
		
	}

	// Read

	// Update

	// Delete

}
