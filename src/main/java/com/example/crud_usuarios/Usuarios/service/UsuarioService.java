package com.example.crud_usuarios.Usuarios.service;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    UsuarioRepositorio usuarioRepositorio;

    @Autowired
    public UsuarioService(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public List<User> getUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public User addUsuario(User usuario) {
        usuarioRepositorio.save(usuario);
        return usuario;
    }

    public void deleteUsuario(Long id) {
        usuarioRepositorio.deleteById(id);
    }

    public User getUsuario(Long id) {
        return usuarioRepositorio.findById(id).orElseThrow();
    }

    public User updateUser(User usuario, Long id) {
        Optional<User> usuarioOptional = usuarioRepositorio.findById(id);
        if (usuarioOptional.isPresent()) {
            User usuario1 = usuarioOptional.get();
            usuario1.setEmail(usuario.getEmail());
            usuario1.setPassword(usuario.getPassword());
            usuario1.setName(usuario.getName());
            usuario1.setCpf(usuario.getCpf());
            return usuario;
        }
        return null;
    }

    public User getUsuarioByEmail(String email) {
        return usuarioRepositorio.findByEmail(email);
    }
}
