package com.example.crud_usuarios.Cartao.repository;

import com.example.crud_usuarios.Cartao.model.CardModel;
import com.example.crud_usuarios.Usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<CardModel, Long> {
    CardModel findByCardNumber(String cardNumber);

    List<CardModel> findByUser(User user);
}
