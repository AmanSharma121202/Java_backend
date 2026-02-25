package IntroductionToJava.FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookStoreChallenge {
    public static void main(String[] args) {
        /*
        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $20. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 8
            characters. Identify and display these books.
         */

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


        //Identify all books that are priced over 20$
        System.out.println("Identifying all books that are priced over 20$");
        books.stream()
                .filter(book->book.price > 20)
                .forEach(System.out::println);

        //Identify books that were published before the year 2000.
        System.out.println("Identifying all books that were published before the year 2000");
        books.stream()
                .filter(book-> book.publicationYear > 2000)
                .forEach(System.out::println);

        //Add suffix "(Coming soon)" to all the current titles
        System.out.println("Adding suffix \"(Coming soon)\" to all the current titles");
        books.stream()
                .map(book-> book.title + "(Coming soon)")
                .forEach(System.out::println);

        //Display the books sorted by their prices in ascending order.
        System.out.println("Displaying the books sorted by their prices in ascending order");
        books.stream()
                .sorted(Comparator.comparingDouble(book-> book.price))
                .forEach(System.out::println);

        //A rare book is one where the title has more than 8 characters
        System.out.println("Displaying the rare books");
        books.stream()
                .filter(book-> book.title.length() > 8)
                .forEach(System.out::println);

    }
}
