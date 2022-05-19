package com.cadastro.financiamentos.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.service.FinanciamentoService;

public class TipoFinanciamentoDTO {

	
	private Integer idTipoFinanciamento;
	
	private String dsTipoFinanciamento;

	public Integer getIdTipoFinanciamento() {
		return idTipoFinanciamento;
	}

	public void setIdTipoFinanciamento(Integer idTipoFinanciamento) {
		this.idTipoFinanciamento = idTipoFinanciamento;
	}

	public String getDsTipoFinanciamento() {
		return dsTipoFinanciamento;
	}

	public void setDsTipoFinanciamento(String dsTipoFinanciamento) {
		this.dsTipoFinanciamento = dsTipoFinanciamento;
	}
	 
	
}
