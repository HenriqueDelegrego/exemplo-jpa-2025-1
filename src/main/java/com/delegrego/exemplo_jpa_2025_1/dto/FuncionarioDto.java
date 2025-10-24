package com.delegrego.exemplo_jpa_2025_1.dto;

public class FuncionarioDto {

	private int idFuncionario;

	private String nome;

	private String email;

	private String senha;

	private double salario;

	private int idDepartamento;

	public FuncionarioDto() {

	}

	public FuncionarioDto(int idFuncionario, String nome, String email, String senha, double salario,
			int idDepartamento) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.salario = salario;
		this.idDepartamento = idDepartamento;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	@Override
	public String toString() {
		return "FuncionarioDto [idFuncionario=" + idFuncionario + ", nome=" + nome + ", email=" + email + ", senha="
				+ senha + ", salario=" + salario + ", idDepartamento=" + idDepartamento + "]";
	}

}
