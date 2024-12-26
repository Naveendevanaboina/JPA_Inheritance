package com.neoteric.japconnection.japconnection.scopes;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Class 1: ServiceA
@Component
@Scope("singleton") // Singleton scope
public class ServiceA {
    public void performTask() {
        System.out.println("ServiceA is performing its task.");
    }
}