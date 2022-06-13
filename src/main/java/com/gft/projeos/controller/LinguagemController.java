package com.gft.projeos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.projeos.entities.Linguagem;
import com.gft.projeos.services.LinguagemService;

@Controller
@RequestMapping("linguagem")
public class LinguagemController {
	
	@Autowired
	private LinguagemService linguagemService;
	
	@RequestMapping(path = "novo") // http://localhost:8080/linguagem/novo
	public ModelAndView novaLinguagem() {
		ModelAndView mv = new ModelAndView("linguagem/novo.html");
		mv.addObject("linguagem", new Linguagem());
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "novo")
	public ModelAndView salvarLinguagem(Linguagem linguagem) {
		
		
		ModelAndView mv = new ModelAndView("linguagem/novo.html");
		mv.addObject("linguagem", new Linguagem());
		
		linguagemService.salvarLinguagem(linguagem);
		return mv;
	}
	
	@RequestMapping// http://localhost:8080/linguagem
	public ModelAndView listarLinguagens() {
		ModelAndView mv = new ModelAndView("linguagem/listar.html");
		mv.addObject("lista", linguagemService.listarLinguagens());
		return mv;
	}
}
