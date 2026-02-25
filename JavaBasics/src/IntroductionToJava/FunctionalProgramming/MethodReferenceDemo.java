package IntroductionToJava.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        // Using for Loop
        List<String> names = Arrays.asList("Alice","Charlie","Bob");
        for(int i =0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        // Using enhanced for loop
        for (String name: names){
            System.out.println(name);
        }

        // Using interface
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name){
                System.out.println(name);
            }

        });

        // Using lambda function
        names.forEach((name)-> {
            System.out.println(name);
        });

        //More concise (Method reference)
        names.forEach(System.out::println);

    }
}
