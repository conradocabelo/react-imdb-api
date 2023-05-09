package com.filmes.api.filmes.api.controllers.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.filmes.api.filmes.api.domain.conta.Usuario;
import com.filmes.api.filmes.api.services.conta.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/{email}", method = RequestMethod.GET)
    @GetMapping(value = "/{email}")
    public Usuario buscarUsuarioPorEmail(@PathVariable("email") String email) {
        return usuarioService.buscarUsuarioPorEmail(email);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @PostMapping(value = "/")
    public Usuario inserirUsuario(@RequestBody Usuario usuario) throws Exception {
        return usuarioService.novoUsuario(usuario);
    }
}
