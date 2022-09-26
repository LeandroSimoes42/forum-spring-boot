package br.com.alura.leandro.simoes.freitas.forum.controller.form;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Curso;
import br.com.alura.leandro.simoes.freitas.forum.modelo.Topico;
import br.com.alura.leandro.simoes.freitas.forum.repository.CursoRepository;

public class TopicoForm {
	
	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	@NotNull @NotEmpty @Length(min = 5, max = 1000)
	private String menssagem;
	@NotEmpty @NotNull
	private String nomeCurso;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMenssagem() {
		return menssagem;
	}
	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Topico convert(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, menssagem, curso);
	}
	
	
}
