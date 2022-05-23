package com.cadastro.financiamentos.dto;

import java.util.Date;

import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.TipoFinanciamentoEntity;

public class FinanciamentoDTO {

	private Double valorFinanciamento;
	
	private Double valorParcelas;
	
	private Double valorFinanciamentoTaxa;
	
	private Integer nParcelas;
		
	private Integer tipoFinanciamento;

	private Date dataPrimeiraParcela;
	


	public Date getDataPrimeiraParcela() {
		return dataPrimeiraParcela;
	}





	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;
	}





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





	public Double getValorFinanciamentoTaxa() {
		return valorFinanciamentoTaxa;
	}





	public void setValorFinanciamentoTaxa(Double valorFinanciamentoTaxa) {
		this.valorFinanciamentoTaxa = valorFinanciamentoTaxa;
	}





	public Integer getnParcelas() {
		return nParcelas;
	}





	public void setnParcelas(Integer nParcelas) {
		this.nParcelas = nParcelas;
	}





	public Integer getTipoFinanciamento() {
		return tipoFinanciamento;
	}





	public void setTipoFinanciamento(Integer tipoFinanciamento) {
		this.tipoFinanciamento = tipoFinanciamento;
	}





	public FinanciamentoEntity build(FinanciamentoDTO dto) {
		
		FinanciamentoEntity entity = new FinanciamentoEntity();
		
		Date dataHoraAtual = new Date();
		
		entity.setVlTotalFinanciamento(dto.getValorFinanciamento());
		entity.setVlEntradaFinanciamento(dto.getValorParcelas());
		entity.setNrParcelasFinanciamento(dto.getnParcelas());
		entity.setDtCriacaoFinanciamento(dataHoraAtual);
		entity.setVlFinanciamentoTaxa(dto.getValorFinanciamentoTaxa());
		
		TipoFinanciamentoEntity tipoFinan = new TipoFinanciamentoEntity();
		tipoFinan.setIdTipoFinanciamento(dto.getTipoFinanciamento());
		entity.setTipoFinanciamentoEntity(tipoFinan);
		
		return entity;
	}
	
}
