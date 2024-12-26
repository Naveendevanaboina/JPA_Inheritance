package com.neoteric.japconnection.japconnection.emiconf;


import jakarta.persistence.*;

@Entity
public class EmiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int tenureMonths;
    private double monthlyInstallment;

    @OneToOne
    @JoinColumn(name = "transaction_id")
    private TransactionsEntity transaction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    public void setTenureMonths(int tenureMonths) {
        this.tenureMonths = tenureMonths;
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    public TransactionsEntity getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionsEntity transaction) {
        this.transaction = transaction;
    }
}