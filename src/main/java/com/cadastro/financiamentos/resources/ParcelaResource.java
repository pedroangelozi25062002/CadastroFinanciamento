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

import com.cadastro.financiamentos.dto.ParcelasDTO;
import com.cadastro.financiamentos.models.ParcelaEntity;
import com.cadastro.financiamentos.repository.ParcelaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/parcela")
@Api(value="API REST Financiamento")
public class ParcelaResource {
	
	@Autowired
	ParcelaRepository parcelaRepository;
	
	@ApiOperation(value="Retorna uma lista de Parcelas")
	@GetMapping("/parcela")
	public List<ParcelaEntity> listaParcela(){
		
		return parcelaRepository.findAll();
	}
	
	@ApiOperation(value="Retorna uma parcela unica")
	@GetMapping("/parcela/{idparcela}")
	public Optional<ParcelaEntity> listaParcelaUnica(@PathVariable(value="idParcela") Integer idParcela){
		return parcelaRepository.findById2(idParcela);
	}
	
	@ApiOperation(value="Salva uma parcela")
	@PostMapping("/parcela")
	public void salvaParcela(@RequestBody  ParcelasDTO parcela) {
		
		ParcelaEntity parceEntity = new ParcelaEntity();
		parceEntity = parcela.build(parcela);
		parcelaRepository.save(parceEntity);
	   
	}
	
	@ApiOperation(value="Deleta uma parcela")
	@DeleteMapping("/parcela")
	public void deletaParcela(@RequestBody  ParcelaEntity parcela) {
		parcelaRepository.delete(parcela);
	}
	
	@ApiOperation(value="Atualiza uma parcela")
	@PutMapping("/parcela")
	public ParcelaEntity atualizaParcela(@RequestBody  ParcelaEntity parcela) {
		return parcelaRepository.save(parcela);
	}


	

}