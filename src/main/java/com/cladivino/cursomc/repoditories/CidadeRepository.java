package com.cladivino.cursomc.repoditories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cladivino.cursomc.Domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository <Cidade,Integer> {
	
}
