package com.cladivino.cursomc.repoditories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cladivino.cursomc.Domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto,Integer> {
	
}
