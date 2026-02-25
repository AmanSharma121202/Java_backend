package OOPS.constructors;

public class ConstructorDemo {
    public static void main(String[] args) {
        ClassWithConstructor c1 = new ClassWithConstructor(); // Default Constructor
        ClassWithConstructor c2 = new ClassWithConstructor(10,12); // parameterise constructor
        System.out.println("Values of a and b are "+ c2.a + " and " + c2.b);

        ClassWithConstructor c3 = new ClassWithConstructor();
        System.out.println("Setting the value of a using setters");
        c3.setA(12);
        System.out.println("Getting value of a through getters");
        System.out.println(c3.getA());
    }
}
