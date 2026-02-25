package IntroductionToJava.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // ITERATION 1-LIST: EVEN NUMBER FROM NUMBERS LIST
        List<Integer> evenNumbers = new ArrayList<>();
        for(int num:numbers){
            if(num%2 == 0){
                evenNumbers.add(num);
            }
        }

        System.out.println("Even numbers without streams: " + evenNumbers);

        //ITERATION 2-LIST: WITH STREAMS
        Stream<Integer>integerStream1 = numbers.stream();
        Stream<Integer>integerStream2 = integerStream1.filter(p);
        List<Integer>evenNumbers2 = integerStream2.toList();
        System.out.println("Even numbers with streams: " + evenNumbers2);

        //INTEGER 3
        List<Integer>evenNumbers3 = numbers.stream()
                .filter(num-> num%2==0)
                .toList();
        System.out.println("Even numbers with more unified streams: " + evenNumbers3);

    }

    static Predicate<Integer> p = new Predicate<Integer>(){
        @Override
        public boolean test(Integer integer) {
            int remainder = integer%2;
            return remainder==0;
        }
    };

    static Predicate<Integer>p2 = (integer)-> integer%2==0;

}
