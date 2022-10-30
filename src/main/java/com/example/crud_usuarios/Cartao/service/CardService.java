package com.example.crud_usuarios.Cartao.service;

import com.example.crud_usuarios.Cartao.model.CardModel;
import com.example.crud_usuarios.Cartao.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<CardModel> getCards() {
        return cardRepository.findAll();
    }

    public CardModel addCard(CardModel card) {
        cardRepository.save(card);
        return card;
    }

    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }

    public CardModel getCard(Long id) {
        return cardRepository.findById(id).orElseThrow();
    }

    public CardModel updateCard(CardModel card, Long id) {
        Optional<CardModel> cardOptional = cardRepository.findById(id);
        if (cardOptional.isPresent()) {
            CardModel card1 = cardOptional.get();
            card1.setCardholderName(card.getCardholderName());
            card1.setCardNumber(card.getCardNumber());
            card1.setValidThru(card.getValidThru());
            card1.setSecurityCode(card.getSecurityCode());
            card1.setBank(card.getBank());
            card1.setBankBranch(card.getBankBranch());
            card1.setBankAccountNumber(card.getBankAccountNumber());
            return card;
        }
        return null;
    }

    public CardModel getCardByCardNumber(String cardNumber) {
        return cardRepository.findByCardNumber(cardNumber);
    }
}
