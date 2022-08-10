package com.cladivino.cursomc.repoditories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cladivino.cursomc.Domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco,Integer> {
	
}
