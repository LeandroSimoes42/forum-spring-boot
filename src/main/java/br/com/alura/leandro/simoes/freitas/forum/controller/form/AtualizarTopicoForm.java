package br.com.alura.leandro.simoes.freitas.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Topico;
import br.com.alura.leandro.simoes.freitas.forum.repository.topicoRepository;

public class AtualizarTopicoForm {
	
	@NotEmpty @NotNull @Length(min = 5)
	private String titulo;
	@NotEmpty @NotNull @Length(min = 5, max = 1000)
	private String mensagem;
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Topico atualizar(Long id, topicoRepository topicoRepository) {
		Topico topico = topicoRepository.getReferenceById(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		return topico;
	}
	
	
	
	
	
	
}
