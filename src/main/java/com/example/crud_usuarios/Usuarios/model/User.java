package com.example.crud_usuarios.Usuarios.model;

import com.example.crud_usuarios.Cartao.model.CardModel;
import com.example.crud_usuarios.DriversLicense.model.DriversLicenseModel;
import com.example.crud_usuarios.Identity.model.IdentityModel;
import com.example.crud_usuarios.Passport.model.PassportModel;
import com.example.crud_usuarios.Terceiro.model.ThirdModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@JsonIgnoreProperties(value= {"cards"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String secretKey;
    private String password;
    private String email;
    private String name;
    private String cpf;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<CardModel> cards = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<DriversLicenseModel> driversLicenses = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<IdentityModel> identities = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<PassportModel> passports = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<ThirdModel> thirds = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<CardModel> getCards() {
        return cards;
    }

    public List<DriversLicenseModel> getDriversLicenses() {
        return driversLicenses;
    }

    public List<IdentityModel> getIdentities() {
        return identities;
    }

    public List<PassportModel> getPassports() {
        return passports;
    }

    public List<ThirdModel> getThirds() {
        return thirds;
    }
}
