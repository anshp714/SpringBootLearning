package com.codingshuttle.ansh.mod1intro;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("request")
    public PaymentService paymentservice(){

        return new PaymentService();
    }
}
