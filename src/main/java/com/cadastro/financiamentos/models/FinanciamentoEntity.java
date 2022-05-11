package com.cadastro.financiamentos.models;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="TB_FINAN")
public class FinanciamentoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_FINANCIAMENTO")
	private Integer idFinanciamento;
	
	@Column(name = "VL_TOTAL_FINANCIAMENTO")
	private Double vlTotalFinanciamento;
	
	@Column(name = "VL_ENTRADA_FINANCIAMENTO")
	private Double vlEntradaFinanciamento;
	
	@Column(name = "NR_PARCELAS_FINANCIAMENTO")
	private Integer nrParcelasFinanciamento;
	
	@Column(name = "DT_PRIMEIRA_PARCELA_FINANCIAMENTO")
	private Date dtPrimeiraParcelaFinanciamento;
	
	@Column(name = "VL_FINANCIAMENTOTAXA")
	private Double vlFinanciamentoTaxa;
	
	@Column(name = "DT_CRIACAO_FINANCIAMENTO")
	private Date dt_criacao_financiamento;
    
	@OneToMany
	private List<ParcelaEntity> parcelas;
	
	public Integer getIdFinanciamento() {
		return idFinanciamento;
	}

	public void setIdFinanciamento(Integer idFinanciamento) {
		this.idFinanciamento = idFinanciamento;
	}

	public Double getVlTotalFinanciamento() {
		return vlTotalFinanciamento;
	}

	public void setVlTotalFinanciamento(Double vlTotalFinanciamento) {
		this.vlTotalFinanciamento = vlTotalFinanciamento;
	}

	public Double getVlEntradaFinanciamento() {
		return vlEntradaFinanciamento;
	}

	public List<ParcelaEntity> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<ParcelaEntity> parcelas) {
		this.parcelas = parcelas;
	}

	public void setVlEntradaFinanciamento(Double vlEntradaFinanciamento) {
		this.vlEntradaFinanciamento = vlEntradaFinanciamento;
	}

	public Integer getNrParcelasFinanciamento() {
		return nrParcelasFinanciamento;
	}

	public void setNrParcelasFinanciamento(Integer nrParcelasFinanciamento) {
		this.nrParcelasFinanciamento = nrParcelasFinanciamento;
	}

	public Date getDtPrimeiraParcelaFinanciamento() {
		return dtPrimeiraParcelaFinanciamento;
	}

	public void setDtPrimeiraParcelaFinanciamento(Date dtPrimeiraParcelaFinanciamento) {
		this.dtPrimeiraParcelaFinanciamento = dtPrimeiraParcelaFinanciamento;
	}

	public Double getVlFinanciamentoTaxa() {
		return vlFinanciamentoTaxa;
	}

	public void setVlFinanciamentoTaxa(Double vlFinanciamentoTaxa) {
		this.vlFinanciamentoTaxa = vlFinanciamentoTaxa;
	}

	public Date getDt_criacao_financiamento() {
		return dt_criacao_financiamento;
	}

	public void setDt_criacao_financiamento(Date dt_criacao_financiamento) {
		this.dt_criacao_financiamento = dt_criacao_financiamento;
	}
}
