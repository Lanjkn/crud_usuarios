package com.example.crud_usuarios.creditCard.service;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import com.example.crud_usuarios.creditCard.model.CreditCard;
import com.example.crud_usuarios.creditCard.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {

    private final CreditCardRepository creditCardRepository;

    private final UsuarioService usuarioService;

    @Autowired
    public CreditCardService(CreditCardRepository creditCardRepository, UsuarioService usuarioService) {
        this.creditCardRepository = creditCardRepository;
        this.usuarioService = usuarioService;
    }

    public CreditCard saveCreditCard(CreditCard creditCard, String userEmail) {
        User user = usuarioService.getUsuarioByEmail(userEmail);
        creditCard.setUser(user);
        return creditCardRepository.save(creditCard);
    }

    public List<CreditCard> findAllCreditCards(String userEmail) {
        User user = usuarioService.getUsuarioByEmail(userEmail);
        return creditCardRepository.findByUser(user);
    }
}
