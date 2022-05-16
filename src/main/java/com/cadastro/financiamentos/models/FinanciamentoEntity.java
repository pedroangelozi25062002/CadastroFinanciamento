package com.cadastro.financiamentos.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_FINAN")
public class FinanciamentoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_FINANCIAMENTO")
	private Integer idFinanciamento;
	
	@Column(name = "VL_TOTAL_FINANCIAMENTO")
	private BigDecimal vlTotalFinanciamento;
	
	@Column(name = "VL_ENTRADA_FINANCIAMENTO")
	private Double vlEntradaFinanciamento;
	
	@Column(name = "NR_PARCELAS_FINANCIAMENTO")
	private BigDecimal nrParcelasFinanciamento;
	
	@Column(name = "DT_PRIMEIRA_PARCELA_FINANCIAMENTO")
	private Date dtPrimeiraParcelaFinanciamento;
	
	@Column(name = "VL_FINANCIAMENTOTAXA")
	private BigDecimal vlFinanciamentoTaxa;
	
	@Column(name = "DT_CRIACAO_FINANCIAMENTO")
	private Date dtCriacaoFinanciamento;
    
	
	 @OneToMany(mappedBy = "financiamento", targetEntity = ParcelaEntity.class, fetch = FetchType.LAZY)
	 private List<ParcelaEntity> parcela;


	public Integer getIdFinanciamento() {
		return idFinanciamento;
	}


	public void setIdFinanciamento(Integer idFinanciamento) {
		this.idFinanciamento = idFinanciamento;
	}


	public BigDecimal getVlTotalFinanciamento() {
		return vlTotalFinanciamento;
	}


	public void setVlTotalFinanciamento(BigDecimal vlTotalFinanciamento) {
		this.vlTotalFinanciamento = vlTotalFinanciamento;
	}


	public Double getVlEntradaFinanciamento() {
		return vlEntradaFinanciamento;
	}


	public void setVlEntradaFinanciamento(Double vlEntradaFinanciamento) {
		this.vlEntradaFinanciamento = vlEntradaFinanciamento;
	}


	public BigDecimal getNrParcelasFinanciamento() {
		return nrParcelasFinanciamento;
	}


	public void setNrParcelasFinanciamento(BigDecimal nrParcelasFinanciamento) {
		this.nrParcelasFinanciamento = nrParcelasFinanciamento;
	}


	public Date getDtPrimeiraParcelaFinanciamento() {
		return dtPrimeiraParcelaFinanciamento;
	}


	public void setDtPrimeiraParcelaFinanciamento(Date dtPrimeiraParcelaFinanciamento) {
		this.dtPrimeiraParcelaFinanciamento = dtPrimeiraParcelaFinanciamento;
	}


	public BigDecimal getVlFinanciamentoTaxa() {
		return vlFinanciamentoTaxa;
	}


	public void setVlFinanciamentoTaxa(BigDecimal bigDecimal) {
		this.vlFinanciamentoTaxa = bigDecimal;
	}


	public Date getDtCriacaoFinanciamento() {
		return dtCriacaoFinanciamento;
	}


	public void setDtCriacaoFinanciamento(Date dtCriacaoFinanciamento) {
		this.dtCriacaoFinanciamento = dtCriacaoFinanciamento;
	}


	public List<ParcelaEntity> getParcela() {
		return parcela;
	}


	public void setParcela(List<ParcelaEntity> parcela) {
		this.parcela = parcela;
	}
	
}