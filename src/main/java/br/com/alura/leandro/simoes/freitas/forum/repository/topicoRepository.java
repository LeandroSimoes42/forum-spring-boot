package br.com.alura.leandro.simoes.freitas.forum.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Topico;

public interface topicoRepository extends JpaRepository<Topico, Long>{

	Page<Topico> findByCurso_Nome(String cursoNome, Pageable pagination);


}
