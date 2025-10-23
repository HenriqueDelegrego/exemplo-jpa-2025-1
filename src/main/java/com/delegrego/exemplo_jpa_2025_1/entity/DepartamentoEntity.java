package com.delegrego.exemplo_jpa_2025_1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class DepartamentoEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private int idDepartamento;
	
	@Column(name = "nm_departamento")
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
