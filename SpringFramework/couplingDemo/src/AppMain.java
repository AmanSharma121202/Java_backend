import looseCoupling.EmailNotificationService;
import looseCoupling.NotificationService;
import looseCoupling.SMSNotificationService;
import tightCoupling.UserService;

public class AppMain {
    public static void main(String[] args) {
        // Tight Coupling
        UserService userService = new UserService();
        userService.notifyUser("Order placed");
        // Loose Coupling
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();
        looseCoupling.UserService userServiceLoose = new looseCoupling.UserService(smsService); // Constructor injection
        userServiceLoose.notifyUser("Order placed");

        /*
        ----------Different types of dependency injection
        Constructor Injection : dependency is provided via constructor
        Setter Injection: dependency is provided via setter method
        Field Injection: dependency is assigned directly to a field(We can use an example of public dependency in userService class)
        */

    }
}

