package IntroductionToJava.FunctionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x%2==0;
        BiPredicate<Integer,Integer> isSumEven = (a,b) -> (a+b)%2 ==0;

        System.out.println(isEven.test(13));
        System.out.println(isSumEven.test(100,330));
    }
}
