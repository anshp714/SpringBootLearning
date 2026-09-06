package com.codingshuttle.ansh.mod1intro.impl;

import com.codingshuttle.ansh.mod1intro.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("sending Email..." +message);
    }
}
