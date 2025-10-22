package com.delegrego.exemplo_jpa_2025_1.entity;

public class FuncionarioEntity {

	private int idFuncionario;
	private String nome;
	private String email;
	private String senha;
	private double salario;
	private DepartamentoEntity departamento;

	public FuncionarioEntity(int idFuncionario, String nome, String email, String senha, double salario,
			DepartamentoEntity departamento) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.salario = salario;
		this.departamento = departamento;
	}

	public FuncionarioEntity() {

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

	public DepartamentoEntity getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoEntity departamento) {
		this.departamento = departamento;
	}

}
