package com.cadastro.financiamentos.service;

import org.springframework.stereotype.Component;

import com.cadastro.financiamentos.dto.FinanciamentoDTO;
import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;
import com.cadastro.financiamentos.repository.FinanciamentoRepository;
import com.cadastro.financiamentos.repository.ParcelaRepository;

@Component
public class FinanciamentoService {

	private ParcelaRepository parcelaRepository;

	private FinanciamentoRepository financiamentoRepository;

	public FinanciamentoService(ParcelaRepository parcelaRepository,FinanciamentoRepository financiamentoRepository) {
		this.parcelaRepository = parcelaRepository;
		this.financiamentoRepository = financiamentoRepository;
	
	}

	public void salvar(FinanciamentoDTO financiamento) {

		FinanciamentoEntity finanEntity = financiamento.build(financiamento);

	financiamentoRepository.save(finanEntity);

		for (int i = 0; i < financiamento.getnParcelas(); ++i) {

			ParcelaEntity parcelaEntity = new ParcelaEntity();

			parcelaEntity.setVl_parcela(1.0);
			parcelaEntity.setFinanciamento(finanEntity);
			
			parcelaRepository.save(parcelaEntity);

			System.out.println("Parcela: " + i + " ADICIONADA A TB_PARCELA COM SUCESSO");
		}

		System.out.println("Financiamento adicionado na TB_FINAN com sucesso!");

	}
}