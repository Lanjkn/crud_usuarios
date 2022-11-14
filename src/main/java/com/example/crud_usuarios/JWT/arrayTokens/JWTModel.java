package com.example.crud_usuarios.JWT.arrayTokens;

public class JWTModel {
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    private String token;
    private Boolean validity;

}
