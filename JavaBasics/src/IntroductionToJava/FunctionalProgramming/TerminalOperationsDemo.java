package IntroductionToJava.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsDemo {
    public static void main(String[] args) {
//        1. reduce() : It is used to reduce stream values to single value
        //We will calculate the number sum using reduce operation
        List<Integer> numbers = Arrays.asList(20,30,40,11,23,37);
        //Method 1
        Stream<Integer> integerStream = numbers.stream();
        int sum1 = integerStream.reduce(0,(acc,num)->acc+num);
        System.out.println("The Sum is: " + sum1);
        //Method 2
        int sum2 = numbers.stream().reduce(0,Integer::sum);
        System.out.println("The Sum is: " + sum2);

//        2. Collect(): It is used to collect the stream values in collectors like set, map etc.
        //We will collect the even stream values in list
        List<Integer>evenNumbers = numbers.stream().filter(num -> num %2 ==0).collect(Collectors.toList());
        System.out.println("The Even Numbers are: " + evenNumbers);
        //We will collect the odd stream values in set
        Set<Integer> oddNumbers = numbers.stream().filter(num -> num %2 != 0).collect(Collectors.toSet());
        System.out.println("The Odd Numbers are: " + oddNumbers);

//        3. find & match: These are used to do find and match operations
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        boolean has20 = numbers.stream().anyMatch(num -> num == 20);
        System.out.println("The Has20 is: " + has20);

//        4. Iteration: It is used to iterate over the stream values
        numbers.stream().forEach(n-> System.out.println(n));
    }
}
