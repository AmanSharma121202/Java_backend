package IntroductionToJava.FunctionalProgramming;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addConsumer = (a, b)-> System.out.println(a+b);
        addConsumer.accept(1,2);
    }
}
