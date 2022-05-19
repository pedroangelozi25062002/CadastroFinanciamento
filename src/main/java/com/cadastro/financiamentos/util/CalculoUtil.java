package com.cadastro.financiamentos.util;

import java.math.BigDecimal;

import com.cadastro.financiamentos.dto.FinanciamentoDTO;

public class CalculoUtil {
	
	private void CalculoJurosCompostos(FinanciamentoDTO financiamento) {
		
		
		BigDecimal nrParc = financiamento.getnParcelas();
		BigDecimal vlTaxa = financiamento.getValorFinanciamentoTaxa();
		BigDecimal vlFinan = financiamento.getValorFinanciamento();
		
	//	BigDecimal vlResult = vlFinan * vlTaxa * nrParc; 
		

	}		

	
			
}
