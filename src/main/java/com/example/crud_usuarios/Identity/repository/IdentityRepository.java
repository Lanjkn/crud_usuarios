package com.example.crud_usuarios.Identity.repository;

import com.example.crud_usuarios.Identity.model.IdentityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepository extends JpaRepository<IdentityModel, Long> {
    IdentityModel findByRg(String rg);
}
