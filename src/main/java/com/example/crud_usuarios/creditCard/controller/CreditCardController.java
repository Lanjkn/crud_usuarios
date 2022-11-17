package com.example.crud_usuarios.creditCard.controller;

import com.example.crud_usuarios.creditCard.model.CreditCard;
import com.example.crud_usuarios.creditCard.model.CreditCardDTO;
import com.example.crud_usuarios.creditCard.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CreditCardController {

    private final CreditCardService creditCardService;

    @Autowired
    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @CrossOrigin
    @GetMapping("/creditCards")
    public List<CreditCard> findAllCreditCards(@RequestHeader String userEmail) {
        return creditCardService.findAllCreditCards(userEmail);
    }
    @CrossOrigin
    @PostMapping("/creditCards")
    public CreditCard saveCreditCard(@RequestBody CreditCardDTO creditCardDTO) {
        return creditCardService.saveCreditCard(creditCardDTO.getCreditCard(), creditCardDTO.getUserEmail());
    }
}
