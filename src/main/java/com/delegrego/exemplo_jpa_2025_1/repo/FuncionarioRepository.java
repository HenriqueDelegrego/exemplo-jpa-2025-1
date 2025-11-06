package com.delegrego.exemplo_jpa_2025_1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delegrego.exemplo_jpa_2025_1.entity.FuncionarioEntity;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Integer> {

	boolean existsByEmail(String email);

	boolean existsByEmailAndIdFuncionarioNot(String email, int id);
	
	boolean existsByDepartamentoIdDepartamento(int idDepartamento);

}
