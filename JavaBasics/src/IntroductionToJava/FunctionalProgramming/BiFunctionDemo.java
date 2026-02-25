package IntroductionToJava.FunctionalProgramming;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static BiFunction<Integer,Integer,Integer> addFunction=(a,b)-> a+b;
    public static BiFunction<Integer,Integer,Integer> subFunction = (a,b)-> a-b;

    public static void main(String[] args) {
       System.out.println(addFunction.apply(10,20));
       System.out.println(subFunction.apply(30,10));

        Function<Integer,Integer> multiplyBy2 = x-> x*2;
        BiFunction<Integer,Integer,Integer> combinedFunction = addFunction.andThen(multiplyBy2);

        System.out.println(combinedFunction.apply(2,5));

    }
}
