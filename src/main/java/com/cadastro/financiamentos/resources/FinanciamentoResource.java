package com.cadastro.financiamentos.resources;


import java.util.List;


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

import com.cadastro.financiamentos.models.FinanciamentoDAO;
import com.cadastro.financiamentos.repository.FinanciamentoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Financiamento")
public class FinanciamentoResource {
	
	@Autowired
	FinanciamentoRepository financiamentoRepository;
	
	@ApiOperation(value="Retorna uma lista de Financiamentos")
	@GetMapping("/financiamento")
	public List<FinanciamentoDAO> listaFinanciamento(){
		return financiamentoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um financiamento unico")
	@GetMapping("/financiamento/{idFinanciamento}")
	public FinanciamentoDAO listaFinanciamentoUnico(@PathVariable(value="idFinanciamento") int idFinanciamento){
		return financiamentoRepository.findById(idFinanciamento);
	}
	
	@ApiOperation(value="Salva um Financiamento")
	@PostMapping("/financiamento")
	public FinanciamentoDAO salvaFinanciamento(@RequestBody  FinanciamentoDAO financiamento) {
		return financiamentoRepository.save(financiamento);
	}
	
	@ApiOperation(value="Deleta um Financiamento")
	@DeleteMapping("/financiamento")
	public void deletaProduto(@RequestBody  FinanciamentoDAO financiamento) {
		financiamentoRepository.delete(financiamento);
	}
	
	@ApiOperation(value="Atualiza um Financiamento")
	@PutMapping("/financiamento")
	public FinanciamentoDAO atualizaFinanciamento(@RequestBody  FinanciamentoDAO financiamento) {
		return financiamentoRepository.save(financiamento);
	}
	 

}