package com.codingshuttle.ansh.mod1intro;

import com.codingshuttle.ansh.mod1intro.impl.EmailNotificationService;
import com.codingshuttle.ansh.mod1intro.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Mod1introApplication implements CommandLineRunner {

////	@Autowired
//	final NotificationService notificationServiceObj; //dependency injection
//
//	public Mod1introApplication(/*@Qualifier("SmsNotif")*/ NotificationService notificationServiceObj) {
//		this.notificationServiceObj = notificationServiceObj; //Constructor DI //Preferred
//	}
	@Autowired
	Map<String, NotificationService> notificationServiceMap = new HashMap<>();

	public static void main(String[] args) {

		SpringApplication.run(Mod1introApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		notificationServiceObj = new EmailNotificationService();
//		notificationServiceObj.send("hello");
		for(var notificationService : notificationServiceMap.entrySet()){
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}

	}

}
