package com.delegrego.exemplo_jpa_2025_1.entity;

public class DepartamentoEntity {
	
	private int idDepartamento;
	
	private String nmDepartamento;

	public DepartamentoEntity(int idDepartamento, String nmDepartamento) {
		super();
		this.idDepartamento = idDepartamento;
		this.nmDepartamento = nmDepartamento;
	}
	
	public DepartamentoEntity() {
		
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNmDepartamento() {
		return nmDepartamento;
	}

	public void setNmDepartamento(String nmDepartamento) {
		this.nmDepartamento = nmDepartamento;
	}
	
	
	

}
