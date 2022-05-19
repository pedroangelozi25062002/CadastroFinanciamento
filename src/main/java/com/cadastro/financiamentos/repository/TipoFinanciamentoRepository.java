package com.cadastro.financiamentos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.financiamentos.models.TipoFinanciamentoEntity;


public interface TipoFinanciamentoRepository extends JpaRepository<TipoFinanciamentoEntity, Integer> {
	
	default Optional<TipoFinanciamentoEntity> findById(Integer idTipoFinanciamento) {

		return null;
	} 
	
	

}