package com.example.crud_usuarios.Identity.model;

import com.example.crud_usuarios.Documento.model.DocumentModel;

public class IdentityModel extends DocumentModel {
    private String rg;
    private String dispatchingAgency;
    private String naturalness;
    private String cpf;
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDispatchingAgency() {
        return dispatchingAgency;
    }

    public void setDispatchingAgency(String dispatchingAgency) {
        this.dispatchingAgency = dispatchingAgency;
    }

    public String getNaturalness() {
        return naturalness;
    }

    public void setNaturalness(String naturalness) {
        this.naturalness = naturalness;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
