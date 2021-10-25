package com.desafio.actDigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.desafio.actDigital.model.Pessoa;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT p FROM Pessoa p WHERE p.id = :id AND (p.cpf = :cpf OR p.rg = :rg)")
    Optional<Pessoa> procurarPessoaPorParametros(@Param("id") long id, @Param("cpf") String cpf, @Param("rg")String rg);
	
}
