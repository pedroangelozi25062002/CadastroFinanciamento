package com.cadastro.financiamentos.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_TIPO_FINANCIAMENTO")
public class TipoFinanciamentoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_FINANCIAMENTO")
	private Integer idTipoFinanciamento;
	
	@Column(name = "DS_TP_FINANCIAMENTO")
	private String dsTipoFinanciamento;
	 
	public TipoFinanciamentoEntity() {
		
	}
	
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