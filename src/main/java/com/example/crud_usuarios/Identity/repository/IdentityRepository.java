package com.example.crud_usuarios.Identity.repository;

import com.example.crud_usuarios.Identity.model.IdentityModel;
import com.example.crud_usuarios.Usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IdentityRepository extends JpaRepository<IdentityModel, Long> {
    IdentityModel findByRg(String rg);

    List<IdentityModel> findByUser(User usuarioByEmail);
}
