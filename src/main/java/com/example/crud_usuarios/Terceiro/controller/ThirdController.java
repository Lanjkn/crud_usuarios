package com.example.crud_usuarios.Terceiro.controller;

import com.example.crud_usuarios.Terceiro.model.ThirdDTO;
import com.example.crud_usuarios.Terceiro.model.ThirdModel;
import com.example.crud_usuarios.Terceiro.service.ThirdService;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ThirdController {
    private final ThirdService service;
    private final UsuarioService usuarioService;

    @Autowired
    public ThirdController(ThirdService service, UsuarioService usuarioService) {
        this.service = service;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/thirds")
    public List<ThirdModel> getThirds(@RequestHeader String userEmail) {
        return service.getThirds(userEmail);
    }

    @PostMapping("/thirds")
    public ThirdModel addThird(@RequestBody ThirdDTO third) {
        return service.addThird(third.getThird(), third.getUserEmail());
    }

    @DeleteMapping("/third_delete/{id}")
    public void deleteThird(@PathVariable int id) {
        service.deleteThird((long) id);
    }

    @PostMapping("/thrids/{id}")
    public ThirdModel updateThrid(@RequestBody ThirdModel thrid, @PathVariable int id) {
        return service.updateThird(thrid, (long) id);
    }

    @GetMapping("/thrids/{id}")
    public ThirdModel getThrid(@PathVariable int id) {
        return service.getThird((long) id);
    }

    public ThirdModel getThridByApplicationName(String applicationName) {
        return service.getThirdByApplicationName(applicationName);
    }
}
