package com.example.crud_usuarios.Util;

import org.apache.commons.codec.digest.DigestUtils;

public class Util {

    private Util() {
    }

    public static String hashSHA256(String text) {
        return DigestUtils.sha256Hex(text);
    }
}
