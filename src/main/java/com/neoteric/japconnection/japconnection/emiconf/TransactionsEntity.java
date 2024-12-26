package com.neoteric.japconnection.japconnection.emiconf;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TransactionsEntity {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double amount;
    private boolean isEmi;

    @ManyToOne
    @JoinColumn(name = "credit_card_id")
    private CreditCardEntity creditCard;

    @OneToOne(mappedBy = "transaction", cascade = CascadeType.ALL)
    private EmiEntity emi;

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isEmi() {
        return isEmi;
    }

    public void setEmi(boolean emi) {
        isEmi = emi;
    }

    public CreditCardEntity getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCardEntity creditCard) {
        this.creditCard = creditCard;
    }

    public EmiEntity getEmi() {
        return emi;
    }

    public void setEmi(EmiEntity emi) {
        this.emi = emi;
    }
}
