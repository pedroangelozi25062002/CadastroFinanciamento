package com.cadastro.financiamentos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.financiamentos.models.ParcelaEntity;


public interface ParcelaRepository extends JpaRepository<ParcelaEntity, Integer> {
	default Optional<ParcelaEntity> findById2(Integer idParcela) {

		return null;
	} 
	

}