package com.example.crud_usuarios.Passport.repository;

import com.example.crud_usuarios.Passport.model.PassportModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<PassportModel, Long> {
    PassportModel findByPassportNumber(String passportNumber);
}
