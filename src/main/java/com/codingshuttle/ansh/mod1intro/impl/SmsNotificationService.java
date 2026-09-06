package com.codingshuttle.ansh.mod1intro.impl;

import com.codingshuttle.ansh.mod1intro.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SmsNotif")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms sending..." +message);
    }
}
