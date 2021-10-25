package com.desafio.actDigital.controller;

import com.desafio.actDigital.client.CepGateway;
import com.desafio.actDigital.client.CepResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cep")
public class EnderecoController {
	 
	@Autowired
	CepGateway gateway;
	
	@GetMapping("/{cep}")
	public ResponseEntity<CepResponse> consultarCep(@PathVariable("cep") String cep) {
		return ResponseEntity.ok().body(gateway.consultaCep(cep));
	}
}
