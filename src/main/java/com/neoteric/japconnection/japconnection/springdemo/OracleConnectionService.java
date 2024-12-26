package com.neoteric.japconnection.japconnection.springdemo;




public class OracleConnectionService implements ConnectionService{
    @Override
    public void connect(String dbName, String username, String password) {
        System.out.println("Connecting to Oracle database: " + dbName);
    }
}
