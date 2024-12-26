package com.neoteric.japconnection.japconnection.smartemi;
public class EmiService {
    BillPeriod billPeriod;

    public EmiService(BillPeriod billPeriod) {
        this.billPeriod = billPeriod;
    }

//    public void emiSchedule(Transaction tran, int noofMon) {
//
//        List<SmartEmi> smartEmiList = new ArrayList<>();
//
//        Double amountPerMon = (tran.getTransAmount() + tran.getTransAmount() * 0.1) / noofMon;
//
//        for (int i = 0; i < noofMon; i++) {
//
//            SmartEmi smartEmi = new SmartEmi();
//            smartEmi.setAmountperMon(amountPerMon);
//            smartEmi.setAmountLeft(smartEmi.getAmout() - smartEmi.getAmountperMon());
//            smartEmiList.add(smartEmi);
//
//        }
//
//    }

    public Double emiService(Transaction1 tran, int noofMon) {
        Double amountPerMon;
        if (tran.getTransDate().before(billPeriod.getFromDate()) || tran.getTransDate().after(billPeriod.getFromDate()) || tran.getTransDate().before(billPeriod.getToDate())) {

            amountPerMon = (tran.getTransAmount() + tran.getTransAmount() * 0.1) / noofMon;

        }
        else{
            amountPerMon = (tran.getTransAmount() + tran.getTransAmount() * 0.2) / noofMon;

        }

        return amountPerMon;
    }
}