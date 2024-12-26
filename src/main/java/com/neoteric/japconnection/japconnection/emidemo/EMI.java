package com.neoteric.japconnection.japconnection.emidemo;

public class EMI {

      private String  PrincipalAmount;
      private String  InterestRate;

    public EMI() {

    }

    public String getPrincipalAmount() {
        return PrincipalAmount;
    }

    public void setPrincipalAmount(String principalAmount) {
        PrincipalAmount = principalAmount;
    }

    public String getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(String interestRate) {
        InterestRate = interestRate;
    }

    public String getTenure() {
        return Tenure;
    }

    public void setTenure(String tenure) {
        Tenure = tenure;
    }

    public String getEsetMonthlyEMI() {
        return esetMonthlyEMI;
    }

    public void setEsetMonthlyEMI(String esetMonthlyEMI) {
        this.esetMonthlyEMI = esetMonthlyEMI;
    }

    public String getPersist() {
        return persist;
    }

    public void setPersist(String persist) {
        this.persist = persist;
    }

    private String   Tenure;
       private String esetMonthlyEMI;
     private String   persist;

    public EMI(String principalAmount, String interestRate, String tenure, String esetMonthlyEMI, String persist) {
        PrincipalAmount = principalAmount;
        InterestRate = interestRate;
        Tenure = tenure;
        this.esetMonthlyEMI = esetMonthlyEMI;
        this.persist = persist;
    }

    public void setTransaction(Transaction transaction) {
    }

    public void setMonthlyEMI(double v) {
    }

    public Transaction getTransaction() {
        return null;
    }
}
