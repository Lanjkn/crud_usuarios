package com.example.crud_usuarios.Terceiro.repository;

import com.example.crud_usuarios.Terceiro.model.ThirdModel;
import com.example.crud_usuarios.Usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThirdRepositiry extends JpaRepository<ThirdModel, Long> {
    ThirdModel findByApplicationName(String applicationName);

    List<ThirdModel> findByUser(User usuarioByEmail);

}
