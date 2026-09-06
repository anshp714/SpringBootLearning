package com.codingshuttle.ansh.mod1intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mod1introApplication implements CommandLineRunner {

	@Autowired  //this annotation tells the spring framework that bean has to be inject here
	PaymentService paymentserviceobj ;  //way to inject
	public static void main(String[] args) {

		SpringApplication.run(Mod1introApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		paymentserviceobj.pay();

	}
}
