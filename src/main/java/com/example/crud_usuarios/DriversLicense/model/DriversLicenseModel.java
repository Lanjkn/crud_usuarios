package com.example.crud_usuarios.DriversLicense.model;

import com.example.crud_usuarios.Documento.model.DocumentModel;

import javax.persistence.Entity;

@Entity
public class DriversLicenseModel extends DocumentModel {
    private String category;
    private String registrationNumber;
    private String firstLicenseDate;
    private String registratioState;
    private String registrationCity;
    private String mirrorNumber;
    private String cpf;
    private String expirationDate;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFirstLicenseDate() {
        return firstLicenseDate;
    }

    public void setFirstLicenseDate(String firstLicenseDate) {
        this.firstLicenseDate = firstLicenseDate;
    }

    public String getRegistratioState() {
        return registratioState;
    }

    public void setRegistratioState(String registratioState) {
        this.registratioState = registratioState;
    }

    public String getRegistrationCity() {
        return registrationCity;
    }

    public void setRegistrationCity(String registrationCity) {
        this.registrationCity = registrationCity;
    }

    public String getMirrorNumber() {
        return mirrorNumber;
    }

    public void setMirrorNumber(String mirrorNumber) {
        this.mirrorNumber = mirrorNumber;
    }


    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
