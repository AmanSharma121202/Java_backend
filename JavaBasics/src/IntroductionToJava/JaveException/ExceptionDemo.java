package IntroductionToJava.JaveException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        /*
          int a = 10;
          int result = 10 / 0;
          System.out.println("Done");
         */
        try{
            // EXCEPTION GENERATING STATEMENTS
            int result = 10 / 0;
        } catch (ArithmeticException e){
            // EXCEPTION HANDLING STATEMENTS
            System.out.println("In Catch Block");
        }
        System.out.println("Done");

        int [] a = {1,2,3};
        try{
            System.out.println(a[8]);
        } catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Outside try catch block");

        try{
           FileReader fileReader = new FileReader("abc.txt");
        } catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}
