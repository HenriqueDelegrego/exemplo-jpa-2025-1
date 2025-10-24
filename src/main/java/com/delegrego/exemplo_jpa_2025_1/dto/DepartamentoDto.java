package com.delegrego.exemplo_jpa_2025_1.dto;

public class DepartamentoDto {

	private int idDepartamento;

	private String nmDepartamento;

	public DepartamentoDto(int idDepartamento, String nmDepartamento) {
		this.idDepartamento = idDepartamento;
		this.nmDepartamento = nmDepartamento;
	}

	public DepartamentoDto() {

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

	@Override
	public String toString() {
		return "DepartamentoDto [idDepartamento=" + idDepartamento + ", nmDepartamento=" + nmDepartamento + "]";
	}

}
