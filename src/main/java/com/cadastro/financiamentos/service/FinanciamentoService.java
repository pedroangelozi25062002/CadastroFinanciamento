package com.cadastro.financiamentos.service;

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

	    financiamentoRepository.save(finanEntity);

		for (int i = 0; i < financiamento.getnParcelas(); ++i) {
			
			ParcelaEntity parcelaEntity = new ParcelaEntity();
			
			DateUtils dateUtils = new DateUtils();
			
			Date d2 = dateUtils.addDate(Calendar.MONTH, i, financiamento.getDataPrimeiraParcela());
			
			parcelaEntity.setVlParcela(financiamento.getValorParcelas());
			parcelaEntity.setVlJurosParcela(financiamento.getValorFinanciamentoTaxa());
			parcelaEntity.setDtPagamentoParcela(d2);
			parcelaEntity.setFinanciamento(finanEntity);
			
			
			parcelaRepository.save(parcelaEntity);

			System.out.println("Parcela: " + i + " ADICIONADA A TB_PARCELA COM SUCESSO");
		}
		
		

		System.out.println("Financiamento adicionado na TB_FINAN com sucesso!");

	}
}