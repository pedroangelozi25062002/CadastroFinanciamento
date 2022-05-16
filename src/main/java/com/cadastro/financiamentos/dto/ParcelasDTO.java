package com.cadastro.financiamentos.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;

public class ParcelasDTO {

	private Integer idParcela;
	
	private Double vl_parcela;
	
	private BigDecimal vl_juros_parcela;
		
	private Date dt_pagamento_parcela;

	
	

	
	

	public Integer getIdParcela() {
		return idParcela;
	}





	public void setIdParcela(Integer idParcela) {
		this.idParcela = idParcela;
	}





	public Double getVl_parcela() {
		return vl_parcela;
	}





	public void setVl_parcela(Double vl_parcela) {
		this.vl_parcela = vl_parcela;
	}





	public BigDecimal getVl_juros_parcela() {
		return vl_juros_parcela;
	}





	public void setVl_juros_parcela(BigDecimal vl_juros_parcela) {
		this.vl_juros_parcela = vl_juros_parcela;
	}





	public Date getDt_pagamento_parcela() {
		return dt_pagamento_parcela;
	}





	public void setDt_pagamento_parcela(Date dt_pagamento_parcela) {
		this.dt_pagamento_parcela = dt_pagamento_parcela;
	}





	public ParcelaEntity build(ParcelasDTO dtoParcela) {
		
		ParcelaEntity entityParcela = new ParcelaEntity();
		
		entityParcela.setIdParcela(dtoParcela.getIdParcela());
		entityParcela.setVlJurosParcela(dtoParcela.getVl_juros_parcela());
		entityParcela.setVlParcela(dtoParcela.getVl_parcela());
		entityParcela.setDtPagamentoParcela(dtoParcela.getDt_pagamento_parcela());
		
		
		return entityParcela;
	}
	
}
