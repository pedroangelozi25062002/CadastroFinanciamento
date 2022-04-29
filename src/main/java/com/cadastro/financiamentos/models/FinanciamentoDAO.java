package com.cadastro.financiamentos.models;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_FINAN")
public class FinanciamentoDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	//	TABELA TB_FINAN
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_FINANCIAMENTO")
	private int idFinanciamento;
	@Column(name = "VL_TOTAL_FINANCIAMENTO")
	private double vlTotalFinanciamento;
	@Column(name = "VL_ENTRADA_FINANCIAMENTO")
	private double vlEntradaFinanciamento;
	@Column(name = "NR_PARCELAS_FINANCIAMENTO")
	private int nrParcelasFinanciamento;
	@Column(name = "DT_PRIMEIRA_PARCELA_FINANCIAMENTO")
	private String dtPrimeiraParcelaFinanciamento;
	@Column(name = "VL_FINANCIAMENTOTAXA")
	private double vlFinanciamentoTaxa;
	@Column(name = "DT_CRIACAO_FINANCIAMENTO")
	private String dt_criacao_financiamento;
	
//	TABELA TB_PARCELA
//	private int id_parcela;
//	private double dt_pagamento_parcela;
//	private double vl_parcela;
//	private double vl_parcela_juros;
	
	public int getId_financiamento() {
		return idFinanciamento;
	}
	public void setId_financiamento(int id_financiamento) {
		this.idFinanciamento = id_financiamento;
	}
	public double getVl_entrada_financiamento() {
		return vlEntradaFinanciamento;
	}
	public void setVl_entrada_financiamento(double vlEntradaFinanciamento) {
		this.vlEntradaFinanciamento = vlEntradaFinanciamento;
	}
	public int getNr_parcelas_financiamento() {
		return nrParcelasFinanciamento;
	}
	public void setNr_parcelas_financiamento(int nrParcelasFinanciamento) {
		this.nrParcelasFinanciamento = nrParcelasFinanciamento;
	}
	public String getDt_primeira_parcela_financiamento() {
		return dtPrimeiraParcelaFinanciamento;
	}
	public void setDt_primeira_parcela_financiamento(String dt_primeira_parcela_financiamento) {
		this.dtPrimeiraParcelaFinanciamento = dtPrimeiraParcelaFinanciamento;
	}
	public String getDt_criacao_financiamento() {
		return dt_criacao_financiamento;
	}
	public void setDt_criacao_financiamento(String dt_criacao_financiamento) {
		this.dt_criacao_financiamento = dt_criacao_financiamento;
	}
	//	public int getId_parcela() {
	//		return id_parcela;
	//	}
	//	public void setId_parcela(int id_parcela) {
	//		this.id_parcela = id_parcela;
	//	}
	//	public double getDt_pagamento_parcela() {
	//		return dt_pagamento_parcela;
	//	}
	//	public void setDt_pagamento_parcela(double dt_pagamento_parcela) {
	//		this.dt_pagamento_parcela = dt_pagamento_parcela;
	//	}
	public double getVlTotalFinanciamento() {
		return vlTotalFinanciamento;
	}
	public void setVl_total_financiamento(double vl_total_financiamento) {
		this.vlTotalFinanciamento = vlTotalFinanciamento;
	}
	public double getVlFinanciamentoTaxa() {
		return vlFinanciamentoTaxa;
	}
	public void setVlFinanciamentoTaxa(double vlFinanciamentoTaxa) {
		this.vlFinanciamentoTaxa = vlFinanciamentoTaxa;
	}
	//	public double getVl_parcela() {
	//		return vl_parcela;
	//	}
	//	public void setVl_parcela(double vl_parcela) {
	//		this.vl_parcela = vl_parcela;
	//	}
	//	public double getVl_parcela_juros() {
	//		return vl_parcela_juros;
	//	}
	//	public void setVl_parcela_juros(double vl_parcela_juros) {
	//		this.vl_parcela_juros = vl_parcela_juros;
	//	}
	
	
	

}
