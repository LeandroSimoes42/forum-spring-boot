package br.com.alura.leandro.simoes.freitas.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.leandro.simoes.freitas.forum.modelo.StatusTopico;
import br.com.alura.leandro.simoes.freitas.forum.modelo.Topico;

public class DetalharTopicoDto {

	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataDaCriacao;
	private String nomeAutor;
	private StatusTopico status;
	private List<RespostasDto> respostas;
	

	public DetalharTopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataDaCriacao = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostasDto::new).collect(Collectors.toList()));
	}


	public Long getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getMensagem() {
		return mensagem;
	}


	public LocalDateTime getDataDaCriacao() {
		return dataDaCriacao;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}


	public StatusTopico getStatus() {
		return status;
	}


	public List<RespostasDto> getRespostas() {
		return respostas;
	}
	
	
	
}
