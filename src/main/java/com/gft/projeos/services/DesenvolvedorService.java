package com.gft.projeos.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.projeos.entities.Desenvolvedor;
import com.gft.projeos.repositories.DesenvolvedorRepository;

@Service
public class DesenvolvedorService {
	@Autowired
	private DesenvolvedorRepository desenvolvedorRepository;

	public Desenvolvedor salvarDesenvolvedor(Desenvolvedor desenvolvedor) {
		return desenvolvedorRepository.save(desenvolvedor);
	}

	public List<Desenvolvedor> listarDesenvolvedores(String nome, String quatroLetras) {
		if (nome != null || quatroLetras!=null)
			return listarDesenvolvedoresPorNomeEQuatroLetras(nome, quatroLetras);
		
		return listarTodosDesenvolvedores();
	}

	private List<Desenvolvedor> listarDesenvolvedoresPorNomeEQuatroLetras(String nome, String quatroLetras) {
		
		return desenvolvedorRepository.findByNomeContainsAndQuatroLetrasContains(nome, quatroLetras);
	}
	
	

	public List<Desenvolvedor> listarTodosDesenvolvedores() {
		return desenvolvedorRepository.findAll();
	}

	public Desenvolvedor obterDesenvolvedor(Long id) throws Exception {
		Optional<Desenvolvedor> desenvolvedor = desenvolvedorRepository.findById(id);

		if (desenvolvedor.isEmpty()) {
			throw new Exception("Desenvolvedor não encontrado");
		}

		return desenvolvedor.get();
	}

	public void excluirDesenvolvedor(Long id) {
		desenvolvedorRepository.deleteById(id);
	}
}
