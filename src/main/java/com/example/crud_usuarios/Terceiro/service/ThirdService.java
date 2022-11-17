package com.example.crud_usuarios.Terceiro.service;

import com.example.crud_usuarios.Terceiro.model.ThirdModel;
import com.example.crud_usuarios.Terceiro.repository.ThirdRepositiry;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThirdService {

    ThirdRepositiry thirdRepositiry;
    UsuarioService usuarioService;

    @Autowired
    public ThirdService(ThirdRepositiry thirdRepositiry, UsuarioService usuarioService) {
        this.thirdRepositiry = thirdRepositiry;
        this.usuarioService = usuarioService;
    }

    public List<ThirdModel> getThirds(String userEmail) {
        return thirdRepositiry.findByUser(usuarioService.getUsuarioByEmail(userEmail));
    }

    public ThirdModel addThird(ThirdModel third, String userEmail) {
        third.setUser(usuarioService.getUsuarioByEmail(userEmail));
        return thirdRepositiry.save(third);
    }

    public void deleteThird(Long id) {
        thirdRepositiry.deleteById(id);
    }

    public ThirdModel getThird(Long id) {
        return thirdRepositiry.findById(id).orElseThrow();
    }

    public ThirdModel updateThird(ThirdModel third, Long id) {
        Optional<ThirdModel> thirdOptional = thirdRepositiry.findById(id);
        if (thirdOptional.isPresent()) {
            ThirdModel third1 = thirdOptional.get();
            third1.setUsername(third.getUsername());
            third1.setPassword(third.getPassword());
            third1.setApplicationName(third.getApplicationName());
            return third;
        }
        return null;
    }

    public ThirdModel getThirdByApplicationName(String applicationName) {
        return thirdRepositiry.findByApplicationName(applicationName);
    }
}
