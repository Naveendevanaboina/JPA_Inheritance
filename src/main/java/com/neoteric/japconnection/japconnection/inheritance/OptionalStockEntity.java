package com.neoteric.japconnection.japconnection.inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
    @Table(name = "optional_stock_latest",schema = "sonar")
    public class OptionalStockEntity extends StockEntity {
        private double strikePrice;
        public double getStrikePrice() {
            return strikePrice;
        }

        public void setStrikePrice(double strikePrice) {
            this.strikePrice = strikePrice;
        }

    }

