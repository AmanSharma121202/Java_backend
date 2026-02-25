package IntroductionToJava.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOperationChallenge {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Silent Garden", 15.99, 2018, "Fiction"),
                new Book("Cosmic Wonders", 22.50, 2020, "Science"),
                new Book("Echoes in the Rain", 12.75, 2005, "Fiction"),
                new Book("A Life in Code", 18.00, 2022, "Biography"),
                new Book("Java Stream Mastery", 35.90, 2023, "Technology"),
                new Book("The Midnight Library", 14.50, 2018, "Fiction"),
                new Book("Quantum Realm", 25.99, 2015, "Science"),
                new Book("Advanced Spring Boot", 40.00, 2023, "Technology"),
                new Book("The Innovator's Journey", 16.99, 2019, "Biography"),
                new Book("Old Man and the Sea", 9.99, 1998, "Fiction")
        );
//      1. Total cost of all books in the bookstore
        Double totalCost = books.stream().mapToDouble(book-> book.price).reduce(0,(acc,price)->acc+price);
        System.out.println("Total Cost of the books is: "+totalCost);

//        2. Collecting books into a list of titles
        List<String>bookTitles = books.stream().map(book->book.title).collect(Collectors.toList());
        System.out.println("Titles of the books is: "+bookTitles);

//        3. Grouping books by category
        Map<String,List<Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(bookStringFunction));
        byCategory.forEach((category,bookList)->{
            bookList.forEach(System.out::println);
        });
    }
    static Function<Book, String> bookStringFunction = new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}


