package com.cadastro.financiamentos.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.cadastro.financiamentos.models.FinanciamentoEntity;

public class FinanciamentoDTO {

	private BigDecimal valorFinanciamento;
	
	private Double valorParcelas;
	
	private BigDecimal valorFinanciamentoTaxa;
	
	private BigDecimal nParcelas;
	
	private Date dataPrimeiraParcela;
	
	
	
	
	public BigDecimal getValorFinanciamento() {
		return valorFinanciamento;
	}



	public void setValorFinanciamento(BigDecimal valorFinanciamento) {
		this.valorFinanciamento = valorFinanciamento;
	}



	public Double getValorParcelas() {
		return valorParcelas;
	}



	public void setValorParcelas(Double valorParcelas) {
		this.valorParcelas = valorParcelas;
	}



	public BigDecimal getnParcelas() {
		return nParcelas;
	}



	public void setnParcelas(BigDecimal nParcelas) {
		this.nParcelas = nParcelas;
	}



	public Date getDataPrimeiraParcela() {
		return dataPrimeiraParcela;
	}



	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;
	}
	



	public BigDecimal getValorFinanciamentoTaxa() {
		return valorFinanciamentoTaxa;
	}



	public void setValorFinanciamentoTaxa(BigDecimal valorFinanciamentoTaxa) {
		this.valorFinanciamentoTaxa = valorFinanciamentoTaxa;
	}



	public FinanciamentoEntity build(FinanciamentoDTO dto) {
		
		FinanciamentoEntity entity = new FinanciamentoEntity();
		
		entity.setVlTotalFinanciamento(dto.getValorFinanciamento());
		entity.setVlEntradaFinanciamento(dto.getValorParcelas());
		entity.setNrParcelasFinanciamento(dto.getnParcelas());
		entity.setDtPrimeiraParcelaFinanciamento(dto.getDataPrimeiraParcela());
		entity.setVlFinanciamentoTaxa(dto.getValorFinanciamentoTaxa());
		
		
		return entity;
	}
	
}
