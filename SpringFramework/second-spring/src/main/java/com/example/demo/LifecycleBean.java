package com.example.demo;

import com.example.looseCoupling.NotificationService;

// This class demonstrates the lifecycle of a Spring Bean, including constructor injection, initialization, and cleanup methods.
// In this example, we are directly returning beam from the method and not using @Component annotation, so we can specify init and destroy methods in @Bean annotation in AppConfig class.
public class LifecycleBean {
    private NotificationService notificationService;
    public LifecycleBean(NotificationService notificationService) {
        System.out.println("Constructor called:Dependency injected: ");
        this.notificationService = notificationService;
    }
    public void init(){
        System.out.println("init called: Bean initialized");
        notificationService.send("Hello from init()");
    }

    public void performTask(){
        System.out.println("Ready to use!");
    }
    public void cleanup(){
        System.out.println("cleanup called: Bean is being destroyed");
    }
}
