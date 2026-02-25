package OOPS.constructors;

public class ClassWithConstructor {
    int a;
    int b;
    public ClassWithConstructor(){
        System.out.println("Constructor is called");
    }

    public ClassWithConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void setA(int a) {     // Setters
        this.a = a;
    }
    public int getA() {           // Getters
        return a;
    }
}
