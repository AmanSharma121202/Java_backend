package OOPS.records;

// Records help to reduce boilerplate by providing default getters and constructor
record Bike(String brand, String speed){}
public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", "200km/h");
        System.out.println("Brand "+bike.brand());
        System.out.println("Speed "+bike.speed());
        System.out.println(bike);
    }
}
