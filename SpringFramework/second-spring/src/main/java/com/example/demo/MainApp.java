package com.example.demo;
import com.example.looseCoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//We are shifting from xml based configuration to annotation based configuration. We are using @Configuration and @ComponentScan annotations to configure our application. We are also using @Component annotation to mark our classes as Spring beans.

public class MainApp {
    public static void main(String[] args) {
///        ApplicationContext context
//                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

//        ApplicationContext context
//                = new AnnotationConfigApplicationContext(AppConfig.class);
//        GreetingService greetingService
//                = (GreetingService) context.getBean("myBean");
        /*GreetingService greetingService
                = context.getBean(GreetingService.class);
        greetingService.sayHello();


        UserService userService
                = (UserService) context.getBean(UserService.class);
        userService.notifyUser("What's up!");*/
/*
        UserService userServiceEmail
                = (UserService) context.getBean("UserServiceEmail");
        userServiceEmail.notifyUser("What's up!");*/

        System.out.println("Starting Spring Application Context");
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Retrieving Lifecycle Bean");
        LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);
        lifecycleBean.performTask();
        System.out.println("Closing Spring Context");

    }
}


