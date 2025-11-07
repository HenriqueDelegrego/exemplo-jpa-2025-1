package com.delegrego.exemplo_jpa_2025_1.dto;

import com.delegrego.exemplo_jpa_2025_1.entity.DepartamentoEntity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartamentoDto {

	private int idDepartamento;

	@NotBlank(message = "Nome do departamento não pode ser vazio")
	@Size(max = 50, message = "Departamento não pode ultrapassar 50 caracteres")
	private String nmDepartamento;

}
