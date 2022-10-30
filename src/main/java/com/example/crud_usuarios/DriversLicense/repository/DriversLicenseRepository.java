package com.example.crud_usuarios.DriversLicense.repository;

import com.example.crud_usuarios.DriversLicense.model.DriversLicenseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriversLicenseRepository extends JpaRepository<DriversLicenseModel, Long> {
    DriversLicenseModel findByRegistrationNumber(String registrationNumber);
}
