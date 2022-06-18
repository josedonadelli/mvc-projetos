package com.gft.projeos.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Projeto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private String nome;
	private String apelido;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataEntrega;
	
	private BigDecimal orcamento;

	@ManyToOne // Muitos projetos podem ter a mesma linguagem
	private Linguagem linguagem;
	
	@ManyToMany
	private List<Desenvolvedor> desenvolvedores;
	
	public List<Desenvolvedor> getDesenvoldedores() {
		return desenvolvedores;
	}

	public void setDesenvoldedores(List<Desenvolvedor> desenvoldedores) {
		this.desenvolvedores = desenvoldedores;
	}

	public Linguagem getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(Linguagem linguagem) {
		this.linguagem = linguagem;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public BigDecimal getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(BigDecimal orcamento) {
		this.orcamento = orcamento;
	}
}
