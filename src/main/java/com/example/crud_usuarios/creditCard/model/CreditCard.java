package com.example.crud_usuarios.creditCard.model;

import com.example.crud_usuarios.Usuarios.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "credit_cards")
@Data
@NoArgsConstructor
public class CreditCard {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String number;

    private String validity;

    private String securityCode;

    private String birth;

    private String documentNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
