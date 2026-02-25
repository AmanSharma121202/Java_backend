package IntroductionToJava;

public class Methods {
    public static void main(String[] args) {
        // Methods
        System.out.println("Inside method section");
        myMethod("Aman");
        int sumValue = numberSum(2,3);
        System.out.println("The sum is "+ sumValue);
    }
    private static void myMethod(String name) {
        System.out.println("Hello " + name);
        System.out.println("how are you");
    }

    private static int numberSum(int a, int b){
        return a+b;
    }
}
