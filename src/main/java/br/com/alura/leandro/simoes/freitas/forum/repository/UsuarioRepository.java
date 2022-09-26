package br.com.alura.leandro.simoes.freitas.forum.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.leandro.simoes.freitas.forum.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findByEmail(String email);
}
