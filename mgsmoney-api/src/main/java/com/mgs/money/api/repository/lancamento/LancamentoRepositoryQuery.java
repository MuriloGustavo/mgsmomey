package com.mgs.money.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mgs.money.api.model.Lancamento;
import com.mgs.money.api.repository.filter.LancamentoFilter;
import com.mgs.money.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
