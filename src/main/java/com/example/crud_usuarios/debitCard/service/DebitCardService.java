package com.example.crud_usuarios.debitCard.service;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import com.example.crud_usuarios.debitCard.model.DebitCard;
import com.example.crud_usuarios.debitCard.repository.DebitCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebitCardService {

    private final DebitCardRepository debitCardRepository;

    private final UsuarioService usuarioService;

    @Autowired
    public DebitCardService(DebitCardRepository debitCardRepository, UsuarioService usuarioService) {
        this.debitCardRepository = debitCardRepository;
        this.usuarioService = usuarioService;
    }

    public DebitCard saveDebitCard(DebitCard debitCard, String userEmail) {
        User user = usuarioService.getUsuarioByEmail(userEmail);
        debitCard.setUser(user);
        return debitCardRepository.save(debitCard);
    }

    public List<DebitCard> findAllDebitCards(String userEmail) {
        User user = usuarioService.getUsuarioByEmail(userEmail);
        return debitCardRepository.findByUser(user);
    }
}
