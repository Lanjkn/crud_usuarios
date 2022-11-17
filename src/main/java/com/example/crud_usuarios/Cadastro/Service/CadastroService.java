package com.example.crud_usuarios.Cadastro.Service;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import com.example.crud_usuarios.Util.Util;
import com.example.crud_usuarios.mfa.MultiFactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.crud_usuarios.mfa.MultiFactor.generateSecretKey;

@Service
public class CadastroService {

    private final UsuarioService usuarioService;

    @Autowired
    public CadastroService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public User cadastrar(User usuario) {
        if (checkIfEmailExists(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado");
        }
        usuario.setSecretKey(generateSecretKey());
        usuario.setPassword(Util.BCryptEncode(usuario.getPassword()));
        usuarioService.addUsuario(usuario);
        return usuario;
    }

    public String getMfaQRCode(String email) {
        User usuario = usuarioService.getUsuarioByEmail(email);
        return MultiFactor.getMfaQRCode(usuario.getSecretKey(), email);
    }

    public boolean checkIfEmailExists(String email) {
        return usuarioService.getUsuarioByEmail(email) != null;
    }
}
