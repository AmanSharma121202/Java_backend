package IntroductionToJava;

import java.util.Scanner;

public class ControlFlow {
/*
    =====================================================
                     What is Control Flow?
    =====================================================

    Control flow means how your program executes statements
    based on conditions or loops. Instead of running code line
    by line blindly, you can tell Java:

    ☑ "Do this if something is true."
    🔁 "Repeat this until a condition changes."
    ➤ "Choose one path from many."

    Java gives us three main types:

    1. Decision‑making → if, else if, else, switch
    2. Loops (Iteration) → for, while, do‑while, enhanced for‑each
    3. Jump statements → break, continue

    */

    public static void main(String[] args) {

//       If-Else
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("You are eligible");
        } else if (age < 18) {
            System.out.println("You are not eligible");
        }

//        If-Else ladder
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = input2.nextInt();

        if (marks > 90) {
            System.out.println("A Grade");
        } else if (marks > 80) {
            System.out.println("B Grade");
        } else {
            System.out.println("C Grade");
        }


//        //Switch case
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the day");
        String day = input3.nextLine();

        switch (day){
            case "Monday"-> System.out.println("First day of week");
            case "Sunday"-> System.out.println("Last day of week");
            default -> System.out.println("Normal day");
        }

      // For loop
        int n = 5;
        System.out.println("Printing for loop");
        for(int i =0; i<n; i++){
            System.out.println(i);
        }

      // While loop
        int num = 3;
        System.out.println("Printing while loop");
        while(num>0){
            System.out.println(num);
            num--;
        }

        // Do while loop
        System.out.println("Printing do while loop");
        int count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // Enhanced for each
        String [] fruits = {"Apple","Orange","Banana"};
        System.out.println("Printing extended for each loop");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Jump statements
        System.out.println("continue use case");
        for(String fruit : fruits){
            if(fruit.equals("Apple")){
                continue;
            }
            System.out.println(fruit);
        }
        System.out.println("break use case");
        for(String fruit : fruits){
            if(fruit.equals("Banana")){
                break;
            }
            System.out.println(fruit);
        }

    }

}



