package com.delegrego.exemplo_jpa_2025_1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.delegrego.exemplo_jpa_2025_1.dto.DepartamentoDto;
import com.delegrego.exemplo_jpa_2025_1.entity.DepartamentoEntity;
import com.delegrego.exemplo_jpa_2025_1.repo.DepartamentoRepository;

import jakarta.validation.Valid;

@Service
@Validated
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepo;

	// CRUD

	// Create
	public void cadastrarDepartamento(@Valid DepartamentoDto departamentoDto) {

		DepartamentoEntity departamentoEntity = new DepartamentoEntity();

		departamentoEntity.setNmDepartamento(departamentoDto.getNmDepartamento());

		departamentoRepo.save(departamentoEntity);

	}

	// Read
	public List<DepartamentoDto> listarDepartamentos() {
		List<DepartamentoEntity> listaDepartamentoEntity = departamentoRepo.findAll();

		List<DepartamentoDto> listaDepartamentoDto = new ArrayList<>();

		for (DepartamentoEntity d : listaDepartamentoEntity) {

			DepartamentoDto departamentoDto = new DepartamentoDto();

			departamentoDto.setIdDepartamento(d.getIdDepartamento());
			departamentoDto.setNmDepartamento(d.getNmDepartamento());

			listaDepartamentoDto.add(departamentoDto);
		}

		return listaDepartamentoDto;

	}

	// Update
	public void atualizarDepartamento(int id, @Valid DepartamentoDto departamentoDto) {

		DepartamentoEntity departamentoEntity = departamentoRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Departamento não existe"));

		// departamentoEntity.setIdDepartamento(id);
		departamentoEntity.setNmDepartamento(departamentoDto.getNmDepartamento());

		departamentoRepo.save(departamentoEntity);
	}

	// Delete
	public void deletarDepartamento(int id) {

		departamentoRepo.findById(id).orElseThrow(() -> new RuntimeException("Departamento não existe"));

		departamentoRepo.deleteById(id);
	}

}
