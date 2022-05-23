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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private Double vlTotalFinanciamento;
	
	@Column(name = "VL_ENTRADA_FINANCIAMENTO")
	private Double vlEntradaFinanciamento;
	
	@Column(name = "NR_PARCELAS_FINANCIAMENTO")
	private Integer nrParcelasFinanciamento;
	
	@Column(name = "VL_FINANCIAMENTOTAXA")
	private Double vlFinanciamentoTaxa;
	
	@Column(name = "DT_CRIACAO_FINANCIAMENTO")
	private Date dtCriacaoFinanciamento;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CD_TP_FINANCIAMENTO")
	private TipoFinanciamentoEntity tipoFinanciamentoEntity;
	
	@OneToMany(mappedBy = "financiamento", targetEntity = ParcelaEntity.class, fetch = FetchType.LAZY)
	private List<ParcelaEntity> parcela;


	public Integer getIdFinanciamento() {
		return idFinanciamento;
	}


	
	public TipoFinanciamentoEntity getTipoFinanciamentoEntity() {
		return tipoFinanciamentoEntity;
	}




	public void setTipoFinanciamentoEntity(TipoFinanciamentoEntity tipoFinanciamentoEntity) {
		this.tipoFinanciamentoEntity = tipoFinanciamentoEntity;
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


	public void setVlEntradaFinanciamento(Double vlEntradaFinanciamento) {
		this.vlEntradaFinanciamento = vlEntradaFinanciamento;
	}


	public Integer getNrParcelasFinanciamento() {
		return nrParcelasFinanciamento;
	}


	public void setNrParcelasFinanciamento(Integer integer) {
		this.nrParcelasFinanciamento = integer;
	}


	public Double getVlFinanciamentoTaxa() {
		return vlFinanciamentoTaxa;
	}


	public void setVlFinanciamentoTaxa(Double bigDecimal) {
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