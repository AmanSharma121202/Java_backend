package com.example;

import com.example.config.AppConfig;
import com.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    UserController controller = context.getBean(UserController.class);
    controller.createUser("Alice");
    controller.listUsers();

    /*
    1. The application is exposed to the user through the UserController, which provides methods to create and list users.
    2. The UserController depends on the UserService to perform business logic related to user management.
    3. The userService, in turn, relies on the UserRepository to interact with the database and manage user data.
    4. The UserRepository uses the DatabaseConnection to perform actual database operations, such as retrieving and saving user information.
    */
    }
}
