package com.delegrego.exemplo_jpa_2025_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.delegrego.exemplo_jpa_2025_1.dto.DepartamentoDto;
import com.delegrego.exemplo_jpa_2025_1.dto.FuncionarioDto;
import com.delegrego.exemplo_jpa_2025_1.service.DepartamentoService;
import com.delegrego.exemplo_jpa_2025_1.service.FuncionarioService;

@Component
public class Controller implements CommandLineRunner {

	@Autowired
	private DepartamentoService departamentoService;
	
	@Autowired
	FuncionarioService funcionarioService;

	@Override
	public void run(String... args) throws Exception {

		FuncionarioDto funcionario = new FuncionarioDto();
		
		funcionario.setNome("Henrique Delegrego");
		funcionario.setEmail("henrique@email.com");
		funcionario.setSenha("senha");
		funcionario.setSalario(50000);
		funcionario.setIdDepartamento(1);
		
			
		funcionarioService.atualizarFuncionario(1, funcionario);
	}

}
