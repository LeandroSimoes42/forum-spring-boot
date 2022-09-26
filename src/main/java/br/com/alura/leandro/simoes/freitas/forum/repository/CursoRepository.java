package br.com.alura.leandro.simoes.freitas.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
