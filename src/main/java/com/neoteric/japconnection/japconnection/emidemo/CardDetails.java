package com.neoteric.japconnection.japconnection.emidemo;

import java.util.Date;

public class CardDetails {

    private String cardNumber;
    private String cardHolderName;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardDetails(String cardNumber, String cardHolderName, java.util.Date date, double creditLimit) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        Date = date;
        this.creditLimit = creditLimit;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    private Date Date;
    private double creditLimit;
}