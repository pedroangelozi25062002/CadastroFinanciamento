package com.cadastro.financiamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.financiamentos.models.FinanciamentoDAO;


public interface FinanciamentoRepository extends JpaRepository<FinanciamentoDAO, Long> {
	FinanciamentoDAO findById(int idFinanciamento);

}

