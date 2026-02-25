package IntroductionToJava;

public class VariableNamesDemo {


    public static void main(String[] args) {
        // VALID variable names
        int age = 25;
        int studentCount = 100;
        int _score = 95;  // legal but not recommended
        int $total = 500; // legal but not recommended
        int gearRation = 6;
        final int MAX_SPEED = 120; // constant naming convention

        // Printing valid variables
        System.out.println("Age: " + age);
        System.out.println("StudentCount: " + studentCount);
        System.out.println("_score: " + _score);
        System.out.println("$total: " + $total);
        System.out.println("gearRation: " + gearRation);
    }
}
