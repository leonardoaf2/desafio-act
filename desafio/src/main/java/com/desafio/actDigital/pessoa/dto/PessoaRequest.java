package com.desafio.actDigital.pessoa.dto;

import com.desafio.actDigital.model.Endereco;
import com.desafio.actDigital.model.Pessoa;
import com.desafio.actDigtal.endereco.dto.EnderecoRequest;

import java.util.Set;

public class PessoaRequest {

	private String nome;

	private String cpf;

	private String rg;

	private Set<EnderecoRequest> enderecos;

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public Set<EnderecoRequest> getEnderecos() {
		return enderecos;
	}
	
	public Pessoa paraEntidade(Set<Endereco> enderecosRequest) {
		if(enderecosRequest != null) {
			return new Pessoa(nome, cpf, rg, enderecosRequest);
		}
		return new Pessoa(nome, cpf, rg);
	}

}
