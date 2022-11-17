package com.example.crud_usuarios.debitCard.model;

import com.example.crud_usuarios.Usuarios.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "credit_cards")
@Data
@NoArgsConstructor
public class DebitCard {
    @Id
    @GeneratedValue
    private Long id;

    private String number;

    private String validity;

    private String securityCode;

    private String bank;

    private String agency;

    private String account;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
