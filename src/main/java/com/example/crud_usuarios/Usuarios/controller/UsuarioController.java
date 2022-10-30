package com.example.crud_usuarios.Usuarios.controller;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioService service;

    @Autowired
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/usuarios")
    public List<User> getUsuarios() {
        return service.getUsuarios();
    }

    @PostMapping("/usuarios")
    public User addUsuario(@RequestBody User usuario) {
        return service.addUsuario(usuario);
    }

    @DeleteMapping("/usuario_delete/{id}")
    public void deleteUsuario(@PathVariable int id) {
        service.deleteUsuario((long) id);
    }

    @PostMapping("/usuarios/{id}")
    public User updateUsuario(@RequestBody User usuario, @PathVariable int id) {
        return service.updateUser(usuario, (long) id);
    }

    @GetMapping("/usuarios/{id}")
    public User getUsuario(@PathVariable int id) {
        return service.getUsuario((long) id);
    }

    public User getUsuarioByEmail(String email) {
        return service.getUsuarioByEmail(email);
    }
}
