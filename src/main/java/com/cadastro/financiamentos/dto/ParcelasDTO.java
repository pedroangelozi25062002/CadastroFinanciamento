package com.cadastro.financiamentos.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;

public class ParcelasDTO {

	private Integer idParcela;
	
	private Double vlParcela;
	
	private Double vlJurosParcela;
		
	private Date dtPagamentoParcela;



	public Integer getIdParcela() {
		return idParcela;
	}



	public void setIdParcela(Integer idParcela) {
		this.idParcela = idParcela;
	}



	public Double getVlParcela() {
		return vlParcela;
	}



	public void setVlParcela(Double vlParcela) {
		this.vlParcela = vlParcela;
	}



	public Double getVlJurosParcela() {
		return vlJurosParcela;
	}



	public void setVlJurosParcela(Double vlJurosParcela) {
		this.vlJurosParcela = vlJurosParcela;
	}



	public Date getDtPagamentoParcela() {
		return dtPagamentoParcela;
	}



	public void setDtPagamentoParcela(Date dtPagamentoParcela) {
		this.dtPagamentoParcela = dtPagamentoParcela;
	}



	public ParcelaEntity build(ParcelasDTO dtoParcela) {
		
		ParcelaEntity entityParcela = new ParcelaEntity();
		
		entityParcela.setIdParcela(dtoParcela.getIdParcela());
		entityParcela.setVlJurosParcela(dtoParcela.getVlJurosParcela());
		entityParcela.setVlParcela(dtoParcela.getVlParcela());
		entityParcela.setDtPagamentoParcela(dtoParcela.getDtPagamentoParcela());
		
		
		return entityParcela;
	}
	
}
