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
		departamentoService.deletarDepartamento(1);
	}

}
