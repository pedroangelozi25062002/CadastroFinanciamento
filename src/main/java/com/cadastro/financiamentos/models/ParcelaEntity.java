package com.cadastro.financiamentos.models;

import java.io.Serializable;
import java.math.BigDecimal;
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
	private Date dtPagamentoParcela ;
	
	@Column(name = "VL_PARCELA")
	private Double vlParcela;
	
	@Column(name = "VL_JUROS_PARCELA")
	private BigDecimal vlJurosParcela ;
	
	 @ManyToOne
	 @JoinColumn(name="financiamento_id")
	 private FinanciamentoEntity financiamento;

	public Integer getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(Integer idParcela) {
		this.idParcela = idParcela;
	}

	public Date getDtPagamentoParcela() {
		return dtPagamentoParcela;
	}

	public void setDtPagamentoParcela(Date dtPagamentoParcela) {
		this.dtPagamentoParcela = dtPagamentoParcela;
	}

	public Double getVlParcela() {
		return vlParcela;
	}

	public void setVlParcela(Double vlParcela) {
		this.vlParcela = vlParcela;
	}

	public BigDecimal getVlJurosParcela() {
		return vlJurosParcela;
	}

	public void setVlJurosParcela(BigDecimal vlJurosParcela) {
		this.vlJurosParcela = vlJurosParcela;
	}

	public FinanciamentoEntity getFinanciamento() {
		return financiamento;
	}

	public void setFinanciamento(FinanciamentoEntity financiamento) {
		this.financiamento = financiamento;
	}
}