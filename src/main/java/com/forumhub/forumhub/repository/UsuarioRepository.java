package com.forumhub.forumhub.repository;

import com.forumhub.forumhub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
