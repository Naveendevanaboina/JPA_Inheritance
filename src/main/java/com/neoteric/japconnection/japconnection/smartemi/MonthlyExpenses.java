package com.neoteric.japconnection.japconnection.smartemi;

import java.util.List;

public class MonthlyExpenses {

    public Double monthlyExpenses(List<Transaction1> transactionList){
        BillPeriod bi=new BillPeriod();
        Double amount=0.0;

        for(Transaction1 transaction:transactionList){
            if(transaction.isSmartEmi()){
                EmiService emiService=new EmiService(bi);
                Double am=emiService.emiService(transaction,5);
                amount+=am;
            }
            else {
                amount+=transaction.getTransAmount();
            }
        }

        return amount;
    }

}
