package com.neoteric.japconnection.japconnection.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve beans
        ServiceA serviceA1 = context.getBean(ServiceA.class);
        ServiceA serviceA2 = context.getBean(ServiceA.class);

        ServiceB serviceB1 = context.getBean(ServiceB.class);
        ServiceB serviceB2 = context.getBean(ServiceB.class);

        // Verify singleton behavior for ServiceA
        System.out.println("ServiceA instances are the same: " + (serviceA1 == serviceA2));

        // Verify prototype behavior for ServiceB
        System.out.println("ServiceB instances are the same: " + (serviceB1 == serviceB2));

        // Perform tasks
        serviceA1.performTask();
        serviceB1.performTask();
    }
}