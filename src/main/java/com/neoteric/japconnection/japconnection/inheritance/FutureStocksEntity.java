package com.neoteric.japconnection.japconnection.inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;



    @Entity
    @Table(name = "futurestocks_latest",schema = "sonar")
    public class FutureStocksEntity extends StockEntity {
        private Date deliveryDate;

        public Date getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(Date deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

    }

