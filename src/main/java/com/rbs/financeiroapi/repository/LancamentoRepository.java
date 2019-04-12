package com.rbs.financeiroapi.repository;

import com.rbs.financeiroapi.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
