package com.example.crud_usuarios.Login.service;

import com.example.crud_usuarios.Login.model.LoginModel;
import com.example.crud_usuarios.Usuarios.controller.UsuarioController;
import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UsuarioController usuarioController;

    @Autowired
    public LoginService(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public Boolean login(LoginModel usuario) {
        User usuarioBanco = usuarioController.getUsuarioByEmail(usuario.getEmail());

        return usuarioBanco.getPassword().equals(usuario.getPassword());
    }
}
