package com.farmaPerez.farmaPerez.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmaPerez.farmaPerez.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List <Produto> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
