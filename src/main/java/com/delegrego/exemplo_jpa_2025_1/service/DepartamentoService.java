package com.delegrego.exemplo_jpa_2025_1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public void atualizarDepartamento(int id, DepartamentoDto departamentoDto) {

		DepartamentoEntity departamentoEntity = new DepartamentoEntity();

		departamentoEntity.setIdDepartamento(id);
		departamentoEntity.setNmDepartamento(departamentoDto.getNmDepartamento());

		departamentoRepo.save(departamentoEntity);
	}

	// Delete

}
