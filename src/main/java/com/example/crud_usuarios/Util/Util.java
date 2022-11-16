package com.example.crud_usuarios.Util;

import org.apache.commons.codec.digest.DigestUtils;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Util {
//    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private Util() {
    }
//
//    public static String BCryptEncode(String text) {
//        return encoder.encode(text);
//    }

    public static String hashSHA256(String text) {
        return DigestUtils.sha256Hex(text);
    }
}
