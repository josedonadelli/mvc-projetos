package com.gft.projeos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.projeos.entities.Linguagem;
import com.gft.projeos.repositories.LinguagemRepository;

@Service // aqui fica toda a logica de negocio
public class LinguagemService {
	@Autowired
	private LinguagemRepository linguagemRepository;

	public Linguagem salvarLinguagem(Linguagem linguagem) {
		return linguagemRepository.save(linguagem);
	}

	public List<Linguagem> listarLinguagens() {
		return linguagemRepository.findAll();
	}
}
