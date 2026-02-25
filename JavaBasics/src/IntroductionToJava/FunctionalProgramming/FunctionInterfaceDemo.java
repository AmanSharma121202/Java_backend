package IntroductionToJava.FunctionalProgramming;

import java.util.function.Function;
public class FunctionInterfaceDemo {
    public static Function<Integer, Integer> addFunction = (a) -> a+3;
    public static Function<Integer,Integer> subtractFunction = (a) -> a-1;

    public static Function<Integer,Integer>combinedFunction =
            addFunction.andThen(subtractFunction);
    public static void main(String[] args) {
       System.out.println(addFunction.apply(2));
       System.out.println(combinedFunction.apply(4));
    }
}
