package com.cadastro.financiamentos.dto;

import java.util.Date;

import com.cadastro.financiamentos.models.FinanciamentoEntity;

public class FinanciamentoDTO {

	private Double valorFinanciamento;
	
	private Double valorParcelas;
	
	private Double valorFinanciamentoTaxa;
	
	private Integer nParcelas;
	
	private Date dataPrimeiraParcela;
	
	
	
	
	public Double getValorFinanciamento() {
		return valorFinanciamento;
	}



	public void setValorFinanciamento(Double valorFinanciamento) {
		this.valorFinanciamento = valorFinanciamento;
	}



	public Double getValorParcelas() {
		return valorParcelas;
	}



	public void setValorParcelas(Double valorParcelas) {
		this.valorParcelas = valorParcelas;
	}



	public Integer getnParcelas() {
		return nParcelas;
	}



	public void setnParcelas(Integer nParcelas) {
		this.nParcelas = nParcelas;
	}



	public Date getDataPrimeiraParcela() {
		return dataPrimeiraParcela;
	}



	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;
	}
	



	public Double getValorFinanciamentoTaxa() {
		return valorFinanciamentoTaxa;
	}



	public void setValorFinanciamentoTaxa(Double valorFinanciamentoTaxa) {
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
