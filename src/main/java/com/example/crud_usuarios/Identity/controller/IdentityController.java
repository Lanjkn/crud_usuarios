package com.example.crud_usuarios.Identity.controller;

import com.example.crud_usuarios.Identity.model.IdentityDTO;
import com.example.crud_usuarios.Identity.model.IdentityModel;
import com.example.crud_usuarios.Identity.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdentityController {
    private final IdentityService service;

    @Autowired
    public IdentityController(IdentityService service) {
        this.service = service;
    }

    @GetMapping("/identities")
    public List<IdentityModel> getIdentities(@RequestHeader String userEmail) {
        return service.getIdentities(userEmail);
    }

    @PostMapping("/identities")
    public IdentityModel addIdentity(@RequestBody IdentityDTO identity) {
        return service.addIdentity(identity.getIdentity(), identity.getUserEmail());
    }

    @DeleteMapping("/identity_delete/{id}")
    public void deleteIdentity(@PathVariable int id) {
        service.deleteIdentity((long) id);
    }

    @PostMapping("/identities/{id}")
    public IdentityModel updateIdentity(@RequestBody IdentityModel identity, @PathVariable int id) {
        return service.updateIdentity(identity, (long) id);
    }

    @GetMapping("/identities/{id}")
    public IdentityModel getIdentity(@PathVariable int id) {
        return service.getIdentity((long) id);
    }

    public IdentityModel getIdentityByRG(String rg) {
        return service.getIdentityByRG(rg);
    }
}
