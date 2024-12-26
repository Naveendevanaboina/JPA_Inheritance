package com.neoteric.japconnection.japconnection.smartemi;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "creditcard")
public class CreditCard {
    @Id
    @Column(name = "cardno", nullable = false)
    private String cardNo; // Assuming card numbers are assigned externally

    @Column(nullable = false)
    private Double cardlimit;


    @OneToMany(mappedBy = "creditCard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction1> transactionList;

    // Getters and Setters
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Double getCardlimit() {
        return cardlimit;
    }

    public void setCardlimit(Double cardlimit) {
        this.cardlimit = cardlimit;
    }

    public List<Transaction1> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction1> transactionList) {
        this.transactionList = transactionList;
    }
}