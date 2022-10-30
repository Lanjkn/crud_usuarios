package com.example.crud_usuarios.Terceiro.repository;

import com.example.crud_usuarios.Terceiro.model.ThirdModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThirdRepositiry extends JpaRepository<ThirdModel, Long> {
    ThirdModel findByApplicationName(String applicationName);
}
