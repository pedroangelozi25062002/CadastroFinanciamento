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
import com.cadastro.financiamentos.repository.ParcelaRepository;
import com.cadastro.financiamentos.util.CalculoUtil;
import com.cadastro.financiamentos.util.DateUtils;

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
		BigDecimal nrParc = financiamento.getnParcelas();		
		BigDecimal vlTaxaa = financiamento.getValorFinanciamentoTaxa();
		BigDecimal vlFinan = financiamento.getValorFinanciamento();
		
		BigDecimal vlResult = vlFinan.multiply(vlTaxaa).multiply(nrParc); 
		BigDecimal vlResultParcelas = vlResult.divide(nrParc);
		
		BigDecimal vlResult2 = nrParc.divide(vlFinan);
		
		BigDecimal vlResult3 = vlResultParcelas.add(vlResult2);
		
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