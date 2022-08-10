package com.cladivino.cursomc.repoditories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cladivino.cursomc.Domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Integer> {
	
}
