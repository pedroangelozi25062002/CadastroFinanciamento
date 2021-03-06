package com.cadastro.financiamentos.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.financiamentos.dto.FinanciamentoDTO;
import com.cadastro.financiamentos.dto.ParcelasDTO;
import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;
import com.cadastro.financiamentos.repository.FinanciamentoRepository;
import com.cadastro.financiamentos.repository.ParcelaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/financiamento")
@Api(value="API REST Financiamento")
public class FinanciamentoResource {
	
	@Autowired
	FinanciamentoRepository financiamentoRepository;
	
	@Autowired
	ParcelaRepository parcelaRepository;
	
	@ApiOperation(value="Retorna uma lista de Financiamentos")
	@GetMapping("/financiamento")
	public List<FinanciamentoEntity> listaFinanciamento(){
		return financiamentoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um financiamento unico")
	@GetMapping("/financiamento/{idFinanciamento}")
	public Optional<FinanciamentoEntity> listaFinanciamentoUnico(@PathVariable(value="idFinanciamento") Integer idFinanciamento){
		return financiamentoRepository.findById(idFinanciamento);
	}
	
	@ApiOperation(value="Salva um Financiamento")
	@PostMapping("/financiamento")
	public void salvaFinanciamento(@RequestBody  FinanciamentoDTO financiamento) {
		if(financiamento.getnParcelas() != null) {
			for(int i = 0; i < financiamento.getnParcelas(); ++i) {
				
				ParcelaEntity parcelaEntity = new ParcelaEntity();
				parcelaRepository.save(parcelaEntity);
				System.out.println("Parcela: " + i + " ADICIONADA A TB_PARCELA COM SUCESSO");
			}
			
		}
		
		FinanciamentoEntity finanEntity = new FinanciamentoEntity();
		finanEntity = financiamento.build(financiamento);
	    financiamentoRepository.save(finanEntity);
	    System.out.println("Financiamento adicionado na TB_FINAN com sucesso!");
	}
	
	@ApiOperation(value="Deleta um Financiamento")
	@DeleteMapping("/financiamento")
	public void deletaProduto(@RequestBody  FinanciamentoEntity financiamento) {
		financiamentoRepository.delete(financiamento);
	}
	
	@ApiOperation(value="Atualiza um Financiamento")
	@PutMapping("/financiamento")
	public FinanciamentoEntity atualizaFinanciamento(@RequestBody  FinanciamentoEntity financiamento) {
		return financiamentoRepository.save(financiamento);
	}

	

}