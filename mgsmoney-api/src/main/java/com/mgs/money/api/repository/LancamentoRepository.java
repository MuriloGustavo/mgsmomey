package com.mgs.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgs.money.api.model.Lancamento;
import com.mgs.money.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
