package com.neoteric.japconnection.japconnection.springdemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.neoteric.dec_dbconnection.springdemo ")

public class SpringConfiguration {

    @Bean
    public ExternalEmployeeService externalEmployeeService(PayService payService) {
        return new ExternalEmployeeService(payService);
    }

    @Bean
    public TCPConnection tcpConnection() {
        return new TCPConnection();
    }

    @Bean
    public ConnectionService mysqlConnectionSerice(TCPConnection tcpConnection) {
        return new MysqlConnectionService(tcpConnection);
    }
}