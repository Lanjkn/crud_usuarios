package com.example.crud_usuarios.DriversLicense.repository;

import com.example.crud_usuarios.DriversLicense.model.DriversLicenseModel;
import com.example.crud_usuarios.Usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriversLicenseRepository extends JpaRepository<DriversLicenseModel, Long> {
    DriversLicenseModel findByRegistrationNumber(String registrationNumber);

    List<DriversLicenseModel> findByUser(User user);
}
