package com.filmes.api.filmes.api.services.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filmes.api.filmes.api.domain.conta.Usuario;
import com.filmes.api.filmes.api.repositories.conta.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findUsuarioByEmail(email);
    }

    @Override
    public Usuario novoUsuario(Usuario usuario) throws Exception {
        if (usuarioRepository.findUsuarioByEmail(usuario.getEmail()) != null)
            throw new Exception("Usuario ja persistido");

        Usuario usuarioPersistido = usuarioRepository.insert(usuario);
        return usuarioPersistido;
    }

}
