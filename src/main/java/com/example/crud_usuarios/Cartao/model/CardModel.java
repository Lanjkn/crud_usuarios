package com.example.crud_usuarios.Cartao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cardholderName;
    private String cardNumber;
    private String validThru;
    private String securityCode;
    private String bank;
    private String bankBranch;
    private String bankAccountNumber;

    public CardModel() {
    }

    public CardModel(long id, String cardholderName, String cardNumber, String validThru, String securityCode, String bank, String bankBranch, String bankAccountNumber) {
        this.id = id;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.validThru = validThru;
        this.securityCode = securityCode;
        this.bank = bank;
        this.bankBranch = bankBranch;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValidThru() {
        return validThru;
    }

    public void setValidThru(String validThru) {
        this.validThru = validThru;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
