package com.neoteric.japconnection.japconnection.conditionalexample;
public class RestWebServiceImpl implements IntegrationWebService{


    public RestWebServiceImpl(){
        System.out.println("RestWebServiceImpl Constructor ...");
    }
    @Override
    public void sendData() {
        System.out.println("RestWebService sending data...");
    }

}