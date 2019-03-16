package com.mgs.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgs.money.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
