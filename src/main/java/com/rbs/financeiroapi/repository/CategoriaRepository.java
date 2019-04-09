package com.rbs.financeiroapi.repository;

import com.rbs.financeiroapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
