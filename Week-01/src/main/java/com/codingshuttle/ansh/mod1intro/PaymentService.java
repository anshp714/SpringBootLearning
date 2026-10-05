package com.codingshuttle.ansh.mod1intro;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay(){
        System.out.println("paying..");
    }
    @PostConstruct
    public void afterinitaa(){
        System.out.println("Before Pay");

    }

    @PreDestroy
    public void beforedestroy(){
        System.out.println("After Payment Done");

    }
}
