package com.example.crud_usuarios.debitCard.repository;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.debitCard.model.DebitCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {

    List<DebitCard> findByUser(User user);
}
