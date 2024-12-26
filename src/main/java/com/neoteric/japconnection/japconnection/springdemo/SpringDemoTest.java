package com.neoteric.japconnection.japconnection.springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        EmployeeService service = context.getBean(EmployeeService.class);
        service.employeeService();
    }
}