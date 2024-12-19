package com.neoteric.japconnection.japconnection.inheritance;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restricted_stock_latest" ,schema = "sonar")
public class RestrictedStockEntity extends StockEntity {
    private int lockInPeriod; // Additional property to RestrictedStock

    public int getLockInPeriod() {
        return lockInPeriod;
    }


    public void setLockInPeriod(int lockInPeriod) {
        this.lockInPeriod = lockInPeriod;
    }
}