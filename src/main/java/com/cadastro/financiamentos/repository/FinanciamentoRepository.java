package com.cadastro.financiamentos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.financiamentos.models.FinanciamentoDAO;


public interface FinanciamentoRepository extends JpaRepository<FinanciamentoDAO, Integer> {
	@Override
	default Optional<FinanciamentoDAO> findById(Integer id) {

		return null;
	} 

}

