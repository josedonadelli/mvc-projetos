package com.gft.projeos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.projeos.entities.Linguagem;
@Repository
public interface LinguagemRepository extends JpaRepository<Linguagem, Long>{

}
