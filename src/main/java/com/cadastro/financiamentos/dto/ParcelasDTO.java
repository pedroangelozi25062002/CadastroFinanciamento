package com.cadastro.financiamentos.dto;

import java.util.Date;

import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;

public class ParcelasDTO {

	private Integer idParcela;
	
	private Double vl_parcela;
	
	private Double vl_juros_parcela;
		
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





	public Double getVl_juros_parcela() {
		return vl_juros_parcela;
	}





	public void setVl_juros_parcela(Double vl_juros_parcela) {
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
		entityParcela.setVl_juros_parcela(dtoParcela.getVl_juros_parcela());
		entityParcela.setVl_parcela(dtoParcela.getVl_parcela());
		entityParcela.setDt_pagamento_parcela(dtoParcela.getDt_pagamento_parcela());
		
		
		return entityParcela;
	}
	
}
