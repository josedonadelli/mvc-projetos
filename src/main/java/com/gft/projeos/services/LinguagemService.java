package com.gft.projeos.services;

import java.util.List;
import java.util.Optional;

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
	
	public Linguagem obterLinguagem(Long id) throws Exception{
		Optional<Linguagem> linguagem = linguagemRepository.findById(id);
		if(linguagem.isEmpty()) {
			throw new Exception("Linguagem nao encontrada");
		}
		return linguagem.get();
		
	}

	public void excluirLinguagem(Long id) {
		linguagemRepository.deleteById(id);
	}
}
