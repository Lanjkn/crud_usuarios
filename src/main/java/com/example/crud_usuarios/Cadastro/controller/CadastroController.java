package com.example.crud_usuarios.Cadastro.controller;

import com.example.crud_usuarios.Cadastro.Service.CadastroService;
import com.example.crud_usuarios.Usuarios.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CadastroController {

    private final CadastroService cadastroService;

    @Autowired
    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @PostMapping("/cadastro")
    public User cadastrar(@RequestBody User usuario) {
        return cadastroService.cadastrar(usuario);
    }

    @PostMapping("/mfaQRCode")
    public String mfa(@RequestBody String email) {
        return cadastroService.getMfaQRCode(email);
    }
}
