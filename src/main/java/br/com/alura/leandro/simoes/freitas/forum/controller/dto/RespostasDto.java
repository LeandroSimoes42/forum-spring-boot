package br.com.alura.leandro.simoes.freitas.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Resposta;

public class RespostasDto {
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	
	
	public RespostasDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}


	public Long getId() {
		return id;
	}


	public String getMensagem() {
		return mensagem;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}
	
	
	
	
}
