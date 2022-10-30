package com.example.crud_usuarios.Cartao.repository;

import com.example.crud_usuarios.Cartao.model.CardModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CardModel, Long> {
    CardModel findByCardNumber(String cardNumber);
}
