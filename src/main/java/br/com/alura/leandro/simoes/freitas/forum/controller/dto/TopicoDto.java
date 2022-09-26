package br.com.alura.leandro.simoes.freitas.forum.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Topico;

public class TopicoDto {
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataDaCriacao;
	

	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataDaCriacao = topico.getDataCriacao();
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


	public static Page<TopicoDto> convert(Page<Topico> topicos) {
		return topicos.map(TopicoDto::new);
	}
	
	
	
}
