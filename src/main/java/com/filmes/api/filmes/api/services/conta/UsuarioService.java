package com.filmes.api.filmes.api.services.conta;

import com.filmes.api.filmes.api.domain.conta.Usuario;

public interface UsuarioService {
    Usuario buscarUsuarioPorEmail(String email);

    Usuario novoUsuario(Usuario usuario) throws Exception;
}
