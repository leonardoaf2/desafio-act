package com.desafio.actDigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.actDigital.model.Endereco;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

	public List<Endereco> findAllByCepContainingIgnoreCase (String cep);
}
