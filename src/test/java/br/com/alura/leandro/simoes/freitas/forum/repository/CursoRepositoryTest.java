package br.com.alura.leandro.simoes.freitas.forum.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Curso;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class CursoRepositoryTest {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Test
	void NaodeveriaCarregarUmCursoAoBuscarPeloNomeQueNaoExiste() {
		String nomeCurso = "HTML 6";
		Curso curso = cursoRepository.findByNome(nomeCurso);
		Assertions.assertNull(curso);
	}

}
