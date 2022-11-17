package com.example.crud_usuarios.Identity.service;

import com.example.crud_usuarios.Identity.model.IdentityModel;
import com.example.crud_usuarios.Identity.repository.IdentityRepository;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdentityService {

    private final IdentityRepository identityRepository;
    private final UsuarioService usuarioService;

    @Autowired
        public IdentityService(IdentityRepository identityRepository, UsuarioService usuarioService) {
        this.identityRepository = identityRepository;
        this.usuarioService = usuarioService;
    }

    public List<IdentityModel> getIdentities(String userEmail) {
        return identityRepository.findByUser(usuarioService.getUsuarioByEmail(userEmail));
    }

    public IdentityModel addIdentity(IdentityModel identity, String userEmail) {
        identity.setUser(usuarioService.getUsuarioByEmail(userEmail));
        identityRepository.save(identity);
        return identity;
    }

    public void deleteIdentity(Long id) {
        identityRepository.deleteById(id);
    }

    public IdentityModel getIdentity(Long id) {
        return identityRepository.findById(id).orElseThrow();
    }

    public IdentityModel updateIdentity(IdentityModel identity, Long id) {
        Optional<IdentityModel> identityOptional = identityRepository.findById(id);
        if (identityOptional.isPresent()) {
            IdentityModel identity1 = identityOptional.get();

            identity1.setRg(identity.getRg());
            identity1.setCpf(identity.getCpf());

            identity1.setName(identity.getName());
            identity1.setFathersName(identity.getFathersName());
            identity1.setMothersName(identity.getMothersName());
            identity1.setBirthDate(identity.getBirthDate());
            identity1.setIssueDate(identity.getIssueDate());

            return identity;
        }
        return null;
    }

    public IdentityModel getIdentityByRG(String rg) {
        return identityRepository.findByRg(rg);
    }

}
