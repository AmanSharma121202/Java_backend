package com.example.looseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// Primary annotation is used to indicate that this bean should be given preference when multiple beans of the same type are present. In this case, if there are multiple implementations of NotificationService, Spring will inject SMSNotificationService by default.
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
