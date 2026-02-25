package IntroductionToJava.FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    public static void main(String[] args) {
        BiFunction<String,Double,String> formatter = (title,price)-> title + " cost, $"+price;
        System.out.println(formatter.apply("Java basics",599.99));

        BiConsumer<String, Double>consumerFormatter = (title,price)-> System.out.println(title + " cost, $"+price);
        consumerFormatter.accept("Java basics",599.99);

        Predicate<Double>isExpensive = price -> price > 500;
        System.out.println(isExpensive.test(599.99));
    }
}



