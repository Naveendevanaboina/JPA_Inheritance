package com.neoteric.japconnection.japconnection.conditionalexample;


public class SoapWebServiceImpl  implements  IntegrationWebService{

    public SoapWebServiceImpl(){
        System.out.println("SoapWebServiceImpl Constructor ...");
    }


    @Override
    public void sendData() {
        System.out.println("SoapWebService sending data...");
    }
}