package com.cladivino.cursomc.repoditories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cladivino.cursomc.Domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado,Integer> {
	
}
