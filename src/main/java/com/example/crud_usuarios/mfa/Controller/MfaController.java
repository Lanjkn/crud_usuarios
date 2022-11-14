package com.example.crud_usuarios.mfa.Controller;

import com.example.crud_usuarios.mfa.Model.MfaModel;
import com.example.crud_usuarios.mfa.Service.MfaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MfaController {
    @Autowired
    MfaService mfaService = new MfaService();

    @PostMapping("/mfa")
    public ResponseEntity<Boolean> mfa(@RequestBody MfaModel mfaModel) {
        if(mfaService.mfa(mfaModel)){
            return ResponseEntity.ok(true);
        }else{
            return ResponseEntity.badRequest().body(false);
        }

    }
}
