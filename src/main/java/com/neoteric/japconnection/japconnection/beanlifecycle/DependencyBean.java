package com.neoteric.japconnection.japconnection.beanlifecycle;

import org.springframework.stereotype.Component;

@Component
public class DependencyBean {
    public void execute() {
        System.out.println("DependencyBean: Executing a dependent task.");
    }
}