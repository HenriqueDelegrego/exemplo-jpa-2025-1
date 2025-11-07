package com.delegrego.exemplo_jpa_2025_1.dto;

import com.delegrego.exemplo_jpa_2025_1.entity.DepartamentoEntity;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
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
public class FuncionarioDto {


	@NotBlank(message = "Nome do funcionário não pode ser vazio")
	@Size(max = 100, message = "Nome do funcionário não pode ultrapassar 100 caracteres")
	private String nome;

	@NotBlank(message = "Email do funcionário não pode ser vazio")
	@Size(max = 50, message = "Email do funcionário não pode ultrapassar 50 caracteres")
	@Email(message = "Email do funcionário inválido")
	private String email;

	@NotBlank(message = "Senha do funcionário não pode ser vazia")
	@Size(max = 50, message = "Senha do funcionário não pode ultrapassar 50 caracteres")
	private String senha;

	@Digits(integer = 10, fraction = 2, message = "Salário do funcionário inválido")
	@PositiveOrZero(message = "Salário do funcionário não pode ser negativo")
	private double salario;

	private int idDepartamento;

}
