package com.example.crud_usuarios.mfa.Service;

import com.example.crud_usuarios.JWT.arrayTokens.JwtArray;
import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.repository.UsuarioRepositorio;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import com.example.crud_usuarios.mfa.Model.MfaModel;
import com.example.crud_usuarios.mfa.MultiFactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MfaService {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    @Autowired
    UsuarioService usuarioService = new UsuarioService(usuarioRepositorio);
    public Boolean mfa(MfaModel mfaModel){

        User user = usuarioService.getUsuarioByEmail(mfaModel.getEmail());
        if(user == null){
            return false;
        }
        if(user.getSecretKey() == null){
            return false;
        }
        if(mfaModel.getCode().equals(MultiFactor.getTOTPCode(user.getSecretKey()))){
            JwtArray.validateToken(mfaModel.getToken());
            return true;
        }
        return false;
    }
}
