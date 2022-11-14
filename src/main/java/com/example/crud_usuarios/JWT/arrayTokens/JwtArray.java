package com.example.crud_usuarios.JWT.arrayTokens;

import java.util.ArrayList;

public class JwtArray {
    static ArrayList<JWTModel> tokens = new ArrayList<>();

    public static Boolean isTokenValidated(String token) {
        for (JWTModel jwt : tokens) {
            if (jwt.getToken().equals(token)) {
                return jwt.getValidity();
            }
        }
        return false;
    }

    public static void validateToken(String token){
        for (JWTModel jwt : tokens) {
            if (jwt.getToken().equals(token)) {
                jwt.setValidity(true);
            }
        }
    }

    public static void addToken(JWTModel token) {
        tokens.add(token);
    }

    public static void showTokens() {
        for (JWTModel jwt : tokens) {
            System.out.println(jwt.getToken() + " -> " + jwt.getValidity());
        }
    }
}
