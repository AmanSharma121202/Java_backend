package com.example.demo;

import com.example.looseCoupling.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Component: Put it on a class. Lets Spring auto-detect and register the class as a bean via component scanning.
//@Bean: Put it on a method inside a @Configuration (or other config) class. The method returns an object that Spring registers as a bean—great for objects you don’t own or that need explicit construction logic.
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public LifecycleBean lifecycleBean(NotificationService notificationService) {
        return new LifecycleBean(notificationService);
    }
}
