package com.cadastro.financiamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cadastro.financiamentos.dto.FinanciamentoDTO;
import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;
import com.cadastro.financiamentos.repository.FinanciamentoRepository;
import com.cadastro.financiamentos.repository.ParcelaRepository;
import com.cadastro.financiamentos.resources.FinanciamentoResource;


@Service("FinanciamentoService")
public class FinanciamentoService {
	
	
	private ParcelaRepository parcelaRepository;

	private FinanciamentoRepository finanRepository; 
	
	private FinanciamentoEntity finanEntity;

	
	public void Salvar(FinanciamentoDTO financiamento)
	{
		if(financiamento.getnParcelas() != null) {
	
			for(int i = 0; i < financiamento.getnParcelas(); ++i) {
				
				ParcelaEntity parcelaEntity = new ParcelaEntity();
				parcelaRepository.save(parcelaEntity);
				System.out.println("Parcela: " + i + " ADICIONADA A TB_PARCELA COM SUCESSO");
			}
		}
		
	
	}
}
	


