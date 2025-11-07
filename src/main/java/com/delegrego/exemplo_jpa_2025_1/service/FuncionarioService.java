package com.delegrego.exemplo_jpa_2025_1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.delegrego.exemplo_jpa_2025_1.dto.FuncionarioDto;
import com.delegrego.exemplo_jpa_2025_1.dto.FuncionarioResponseDto;
import com.delegrego.exemplo_jpa_2025_1.entity.DepartamentoEntity;
import com.delegrego.exemplo_jpa_2025_1.entity.FuncionarioEntity;
import com.delegrego.exemplo_jpa_2025_1.repo.DepartamentoRepository;
import com.delegrego.exemplo_jpa_2025_1.repo.FuncionarioRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@Validated
@RequiredArgsConstructor
public class FuncionarioService {

	private final FuncionarioRepository funcionarioRepo;

	private final DepartamentoRepository departamentoRepo;

	// Create
	public void cadastrarFuncionario(@Valid FuncionarioDto funcionarioDto) {

		if (funcionarioRepo.existsByEmail(funcionarioDto.getEmail())) {
			throw new RuntimeException("Email já cadastrado");
		}

		DepartamentoEntity departamento = departamentoRepo.findById(funcionarioDto.getIdDepartamento())
				.orElseThrow(() -> new RuntimeException("Departamento não existe"));

		FuncionarioEntity funcionarioEntity = new FuncionarioEntity();

		funcionarioEntity.setNome(funcionarioDto.getNome());
		funcionarioEntity.setEmail(funcionarioDto.getEmail());
		funcionarioEntity.setSenha(funcionarioDto.getSenha());
		funcionarioEntity.setSalario(funcionarioDto.getSalario());
		funcionarioEntity.setDepartamento(departamento);

		funcionarioRepo.save(funcionarioEntity);

	}

	// Read
	public List<FuncionarioResponseDto> listarFuncionarios() {

		List<FuncionarioEntity> listaFuncionariosEntity = funcionarioRepo.findAll();

		List<FuncionarioResponseDto> listaFuncionarioDto = new ArrayList<>();

		for (FuncionarioEntity f : listaFuncionariosEntity) {

			FuncionarioResponseDto funcionarioDto = new FuncionarioResponseDto();
			funcionarioDto.setIdFuncionario(f.getIdFuncionario());
			funcionarioDto.setNome(f.getNome());
			funcionarioDto.setEmail(f.getEmail());
			// funcionarioDto.setSenha(f.getSenha());
			funcionarioDto.setSalario(f.getSalario());
			funcionarioDto.setNomeDepartamento(f.getDepartamento().getNmDepartamento());

			listaFuncionarioDto.add(funcionarioDto);

		}

		return listaFuncionarioDto;

	}

	// Update
	public void atualizarFuncionario(int id, @Valid FuncionarioDto funcionarioDto) {

		FuncionarioEntity funcionarioEntity = funcionarioRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

		if (funcionarioRepo.existsByEmailAndIdFuncionarioNot(funcionarioDto.getEmail(), id)) {
			throw new RuntimeException("Email já cadastrado");
		}

		DepartamentoEntity departamento = departamentoRepo.findById(funcionarioDto.getIdDepartamento())
				.orElseThrow(() -> new RuntimeException("Departamento não encontrado"));

		funcionarioEntity.setIdFuncionario(id);
		funcionarioEntity.setNome(funcionarioDto.getNome());
		funcionarioEntity.setEmail(funcionarioDto.getEmail());
		funcionarioEntity.setSenha(funcionarioDto.getSenha());
		funcionarioEntity.setSalario(funcionarioDto.getSalario());
		funcionarioEntity.setDepartamento(departamento);

		funcionarioRepo.save(funcionarioEntity);
	}

	// Delete
	public void deletarFuncionario(int id) {

		funcionarioRepo.findById(id).orElseThrow(() -> new RuntimeException("Funcionário não existe"));

		funcionarioRepo.deleteById(id);
	}

}
