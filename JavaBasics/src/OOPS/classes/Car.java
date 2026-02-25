package OOPS.classes;

public class Car {
    String name;
    String color;
    int price;

    public void drive(){
        System.out.println("You are driving "+this.color + " " + this.name+ " of worth "+this.price+"k USD");
    }
}
