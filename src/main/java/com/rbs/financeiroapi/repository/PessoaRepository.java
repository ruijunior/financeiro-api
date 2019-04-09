package com.rbs.financeiroapi.repository;

import com.rbs.financeiroapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
