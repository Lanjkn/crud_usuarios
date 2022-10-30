package com.example.crud_usuarios.Identidade.model;

import javax.persistence.*;

@Entity
@Table(name = "identity")
public class IdentityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cpf;
    private String rg;
    private String name;
    private String fathersName;
    private String mothersName;
    private String birthDate;
    private String naturalness;
    private String dispatchingAgency;
    private String issueDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNaturalness() {
        return naturalness;
    }

    public void setNaturalness(String naturalness) {
        this.naturalness = naturalness;
    }

    public String getDispatchingAgency() {
        return dispatchingAgency;
    }

    public void setDispatchingAgency(String dispatchingAgency) {
        this.dispatchingAgency = dispatchingAgency;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
