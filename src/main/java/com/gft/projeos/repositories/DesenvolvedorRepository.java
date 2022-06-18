package com.gft.projeos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.projeos.entities.Desenvolvedor;

@Repository
public interface DesenvolvedorRepository extends JpaRepository<Desenvolvedor,Long> {
	List<Desenvolvedor> findByNomeContains(String nome); // 'Contains' é uma ferramenta do spring para repositorio, assim como 'findBy'
	List<Desenvolvedor> findByNomeContainsAndQuatroLetrasContains(String nome, String quatroLetras); // 'And' é uma ferramenta do spring para repositorio, assim como 'findBy'
	
	
}
