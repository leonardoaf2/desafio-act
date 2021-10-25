package com.desafio.actDigital.model;
import javax.persistence.*;

import com.desafio.actDigital.client.CepResponse;

@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String cep;

	private String rua;

	private String numero;

	private String bairro;

	private String cidade;

	private String estado;

	@ManyToOne
	private Pessoa pessoa;

	public long getId() {
		return id;
	}

	public String getCep() {
		return cep;
	}

	public String getRua() {
		return rua;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco(CepResponse enderecoResponse) {
		this.cep = enderecoResponse.getCep();
		this.rua = enderecoResponse.getRua();
		this.bairro = enderecoResponse.getBairro();
		this.cidade = enderecoResponse.getCidade();
		this.estado = enderecoResponse.getEstado();
	}

	public Endereco() {
	}
}
