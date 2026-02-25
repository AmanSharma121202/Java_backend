package com.example.looseCoupling;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//Here we are using @Component annotation to mark our UserService class as a Spring bean. We are also using @Autowired annotation to inject the NotificationService dependency into our UserService class. We can use either constructor injection or setter injection to inject the dependency. In this example, we are using constructor injection.
// Note: If we have only one constructor then we can omit the @Autowired annotation as Spring will automatically use that constructor for dependency injection. However, if we have multiple constructors then we need to specify which constructor to use for dependency injection using the @Autowired annotation.
// Here qualifier is used to specify which implementation of NotificationService we want to inject into our UserService class. In this example, we are injecting the EmailNotificationService implementation of NotificationService into our UserService class. If we want to inject the SMSNotificationService implementation of NotificationService into our UserService class then we can change the qualifier value to "smsNotificationService".
@Component("UserServiceEmail")
public class UserService {
    private final NotificationService notificationService;

//    @Autowired
//    public UserService(@Qualifier("emailNotificationService") NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
    @Autowired
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send(message);
    }
}
