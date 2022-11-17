package com.example.crud_usuarios.debitCard.controller;

import com.example.crud_usuarios.debitCard.model.DebitCard;
import com.example.crud_usuarios.debitCard.model.DebitCardDTO;
import com.example.crud_usuarios.debitCard.service.DebitCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DebitCardController {

    private final DebitCardService debitCardService;

    @Autowired
    public DebitCardController(DebitCardService debitCardService) {
        this.debitCardService = debitCardService;
    }

    @GetMapping("/debitCards")
    public List<DebitCard> findAllDebitCards(@RequestHeader String userEmail) {
        return debitCardService.findAllDebitCards(userEmail);
    }

    @PostMapping("/debitCards")
    public DebitCard saveDebitCard(@RequestBody DebitCardDTO debitCardDTO) {
        return debitCardService.saveDebitCard(debitCardDTO.getDebitCard(), debitCardDTO.getUserEmail());
    }
}
