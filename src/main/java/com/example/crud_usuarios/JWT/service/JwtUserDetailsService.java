//package com.example.crud_usuarios.JWT.service;
//
//import java.util.ArrayList;
//
//import com.example.crud_usuarios.Usuarios.repository.UsuarioRepositorio;
//import com.example.crud_usuarios.Usuarios.service.UsuarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class JwtUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    UsuarioRepositorio usuarioRepositorio;
//    @Autowired
//    UsuarioService usuarioService = new UsuarioService(usuarioRepositorio);
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        com.example.crud_usuarios.Usuarios.model.User user = usuarioService.getUsuarioByEmail(username);
//        if (user.getEmail().equals(username)) {
//            return new User(user.getEmail(), user.getPassword(),
//                    new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//    }
//}