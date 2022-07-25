package com.cladivino.cursomc.repoditories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cladivino.cursomc.Domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria,Integer> {
	
}
