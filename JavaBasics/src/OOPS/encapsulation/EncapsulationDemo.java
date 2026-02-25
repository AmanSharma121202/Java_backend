package OOPS.encapsulation;

class SuperCar {
    private String brand;
    private String color;
    private int speed;

    public SuperCar(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
//        this.speed = speed;
        setSpeed(speed);
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0)
            speed = 0;
        this.speed = speed;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // We cannot set the speed negative as we have limited the functionality to update the speed.
        // We can also completely remove the access to update speed by removing the setter.
        SuperCar car = new SuperCar("BMW", "Red", 400);
        car.drive();
    }
}

//NOTE: We do not need to import class if it is declared in other file but in same package.
// And we need to import if it's present in other package
