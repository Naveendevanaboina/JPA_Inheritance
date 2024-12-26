package com.neoteric.japconnection.japconnection.emidemo;

import java.util.Date;

public class Transaction {

    private String transactionId;
    private Date transactionDate;
    private String transactionType;

    public Transaction() {

    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Transaction(String transactionId, Date transactionDate, String transactionType, double transactionAmount) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    private double transactionAmount;

    public Object getTransactionId() {
        return null;
    }


}

