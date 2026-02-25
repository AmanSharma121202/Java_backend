package OOPS.classes;

import java.util.Date;

public class ClassesObjectDemo {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.name = "BMW";
        car1.color = "Black";
        car1.price = 100;
        car1.drive();

        Date  d = new Date();  // inBuilt class
        System.out.println(d);
    }
}
