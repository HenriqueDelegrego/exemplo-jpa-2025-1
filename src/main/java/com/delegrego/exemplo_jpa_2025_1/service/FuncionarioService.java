package com.delegrego.exemplo_jpa_2025_1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_jpa_2025_1.dto.FuncionarioDto;
import com.delegrego.exemplo_jpa_2025_1.entity.DepartamentoEntity;
import com.delegrego.exemplo_jpa_2025_1.entity.FuncionarioEntity;
import com.delegrego.exemplo_jpa_2025_1.repo.DepartamentoRepository;
import com.delegrego.exemplo_jpa_2025_1.repo.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepo;

	@Autowired
	private DepartamentoRepository departamentoRepo;

	// Create
	public void cadastrarFuncionario(FuncionarioDto funcionarioDto) {

		Optional<DepartamentoEntity> departamento = departamentoRepo.findById(funcionarioDto.getIdDepartamento());

		FuncionarioEntity funcionarioEntity = new FuncionarioEntity();

		funcionarioEntity.setNome(funcionarioDto.getNome());
		funcionarioEntity.setEmail(funcionarioDto.getEmail());
		funcionarioEntity.setSenha(funcionarioDto.getSenha());
		funcionarioEntity.setSalario(funcionarioDto.getSalario());
		funcionarioEntity.setDepartamento(departamento.get());

		funcionarioRepo.save(funcionarioEntity);

	}

	// Read

	// Update

	// Delete

}
