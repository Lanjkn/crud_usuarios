package com.example.crud_usuarios.creditCard.repository;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.creditCard.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

    List<CreditCard> findByUser(User user);
}
