package com.cadastro.financiamentos.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_PARCELA")
public class ParcelaEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_PARCELA")
	private Integer idParcela;
	
	@Column(name = "DT_PAGAMENTO_PARCELA")
	private Date dt_pagamento_parcela ;
	
	@Column(name = "VL_PARCELA")
	private Double vl_parcela;
	
	@Column(name = "VL_JUROS_PARCELA")
	private Double vl_juros_parcela ;
	
	 @ManyToOne
	 @JoinColumn(name="financiamento_id")
	 private FinanciamentoEntity financiamento;

	public Integer getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(Integer idParcela) {
		this.idParcela = idParcela;
	}

	public Date getDt_pagamento_parcela() {
		return dt_pagamento_parcela;
	}

	public void setDt_pagamento_parcela(Date dt_pagamento_parcela) {
		this.dt_pagamento_parcela = dt_pagamento_parcela;
	}

	public Double getVl_parcela() {
		return vl_parcela;
	}

	public void setVl_parcela(Double vl_parcela) {
		this.vl_parcela = vl_parcela;
	}

	public Double getVl_juros_parcela() {
		return vl_juros_parcela;
	}

	public void setVl_juros_parcela(Double vl_juros_parcela) {
		this.vl_juros_parcela = vl_juros_parcela;
	}

	public FinanciamentoEntity getFinanciamento() {
		return financiamento;
	}

	public void setFinanciamento(FinanciamentoEntity financiamento) {
		this.financiamento = financiamento;
	}
}