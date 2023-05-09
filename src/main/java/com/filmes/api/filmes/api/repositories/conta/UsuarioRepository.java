package com.filmes.api.filmes.api.repositories.conta;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.filmes.api.filmes.api.domain.conta.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Usuario findUsuarioByEmail(String email);
}
