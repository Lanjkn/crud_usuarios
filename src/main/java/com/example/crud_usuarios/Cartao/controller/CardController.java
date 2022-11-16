package com.example.crud_usuarios.Cartao.controller;

import com.example.crud_usuarios.Cartao.model.CardDTO;
import com.example.crud_usuarios.Cartao.model.CardModel;
import com.example.crud_usuarios.Cartao.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CardController {

    private final CardService service;

    @Autowired
    public CardController(CardService service) {
        this.service = service;
    }

    @GetMapping("/cards")
    public List<CardModel> getCards(@RequestHeader String userEmail) {
        return service.getCards(userEmail);
    }

    @PostMapping("/cards")
    public CardModel addCard(@RequestBody CardDTO card) {
        return service.addCard(card.getCard(), card.getUserEmail());
    }

    @DeleteMapping("/card_delete/{id}")
    public void deleteCard(@PathVariable int id) {
        service.deleteCard((long) id);
    }

    @PostMapping("/cards/{id}")
    public CardModel updateCard(@RequestBody CardModel card, @PathVariable int id) {
        return service.updateCard(card, (long) id);
    }

    @GetMapping("/cards/{id}")
    public CardModel getCard(@PathVariable int id) {
        return service.getCard((long) id);
    }

    public CardModel getCardByCardNumber(String cardNumber) {
        return service.getCardByCardNumber(cardNumber);
    }

}
