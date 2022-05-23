package com.cadastro.financiamentos.service;

import java.math.BigDecimal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.cadastro.financiamentos.dto.FinanciamentoDTO;
import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;
import com.cadastro.financiamentos.repository.FinanciamentoRepository;
import com.cadastro.financiamentos.repository.ParcelaRepository;import com.cadastro.financiamentos.util.DateUtils;

@Component
public class FinanciamentoService {

	private ParcelaRepository parcelaRepository;

	private FinanciamentoRepository financiamentoRepository;

	public FinanciamentoService(ParcelaRepository parcelaRepository,FinanciamentoRepository financiamentoRepository) {
		this.parcelaRepository = parcelaRepository;
		this.financiamentoRepository = financiamentoRepository;
	
	}

	public void salvar(FinanciamentoDTO financiamento) throws ParseException {
		
		FinanciamentoEntity finanEntity = financiamento.build(financiamento);		
		
		//CalculoJurosCompostos
		Integer nrParc = financiamento.getnParcelas();
		Double nrParc2 = (double) nrParc;
		Double vlParc = financiamento.getValorParcelas();
		Double vlTaxaa = financiamento.getValorFinanciamentoTaxa();
		Double vlFinan = financiamento.getValorFinanciamento();
		
		Double vlResult = vlFinan * vlTaxaa * nrParc2; 
		Double vlResultParcelas = vlResult/nrParc;
		
		Double vlResult3 = vlResultParcelas+vlParc;
		
		System.out.println("Juros total:  " + vlResult);
		System.out.println("Juros mensal: " + vlResultParcelas);
		System.out.println("Juros mensal + valor parcela: " +  vlResult3);
				
		financiamentoRepository.save(finanEntity);		
		
		for (int i = 1; i < financiamento.getnParcelas().intValue(); ++i) {
			
			ParcelaEntity parcelaEntity = new ParcelaEntity();
			
			DateUtils dateUtils = new DateUtils();
			
			Date d2 = dateUtils.addDate(Calendar.MONTH, i, financiamento.getDataPrimeiraParcela());
			
			parcelaEntity.setVlParcela(vlResult3);
			parcelaEntity.setDtPagamentoParcela(d2);
			parcelaEntity.setVlJurosParcela(vlResultParcelas);
			parcelaEntity.setFinanciamento(finanEntity);
						
			parcelaRepository.save(parcelaEntity);

		}
		
		System.out.println("ADICIONADA A TB_PARCELA COM SUCESSO");
		
		
	}
}