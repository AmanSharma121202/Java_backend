package IntroductionToJava.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsIntroDemo {
    public static void main(String[] args) {
        //Stream --> Assembly line/pipelines
        List<String> fruits = Arrays.asList("Apple", "banana", "orange");
        for(String fruit : fruits){
            System.out.println(fruit);
         }

        // Using Streams
//        Stream<String> stream = fruits.stream();
//        stream.forEach((item)-> System.out.println(item));

        Stream<String> stream = fruits.stream();
        stream.forEach(System.out::println);

        System.out.println("Filtered Fruits");
//        Stream<String>streamNew = fruits.stream();
//        Stream<String> filteredStream
//                = streamNew.filter(fruit -> fruit.startsWith("A"));
//        filteredStream.forEach(System.out::println);

        fruits.stream()
                .filter(fruit-> fruit.startsWith("A"))
                .forEach(System.out::println);


    }
}
