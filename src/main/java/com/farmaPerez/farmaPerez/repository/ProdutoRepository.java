package com.farmaPerez.farmaPerez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmaPerez.farmaPerez.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
