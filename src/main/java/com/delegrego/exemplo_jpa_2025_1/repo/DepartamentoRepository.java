package com.delegrego.exemplo_jpa_2025_1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delegrego.exemplo_jpa_2025_1.entity.DepartamentoEntity;

public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Integer> {

}
