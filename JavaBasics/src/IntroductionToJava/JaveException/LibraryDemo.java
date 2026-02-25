package IntroductionToJava.JaveException;

// CUSTOM EXCEPTIONS
class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}
class MemberNotFoundException extends Exception {
    public MemberNotFoundException(String message) {
        super(message);
    }
}
class Library {
    int availableBooks = 3;

    // EXCEPTION HANDLING IN LIBRARY MANAGEMENT
    /*
    public void borrowBook(int booksRequested){
        try{
            int [] books = {101, 102, 103};
            System.out.println("Book Requested: " + books[booksRequested]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You requested a book that does not exist in library");
        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        } finally{
            System.out.println("Finally executed");
        }
    }
    */

    // THROW (It is used to throw exception)
    /*
    public void borrowBook(int booksRequestedCount){
        try{
            if(booksRequestedCount > availableBooks){
//                Exception e = new Exception("Not enough books available");
//                throw e;
                throw new Exception("Not enough books available");
            }
        }  catch (Exception e){
            System.out.println("Exception occurred");
        } finally{
            System.out.println("Finally block executed");
        }
    }
    */

    // THROWS (It is used to define that an exception is occurred in the function. It allows us to define exception handling outside the function where it occurred)
public void borrowBook(String memberName, int booksRequestedCount ) throws Exception {
    if (booksRequestedCount > availableBooks){
        throw new BookUnavailableException("Not enough books available");
    }
    if (memberName == null || memberName.isEmpty()){
        throw new MemberNotFoundException("Member Not Found");
    }
    if(booksRequestedCount <= 0){
        throw new Exception("You must request atleast 1 book");
    }
  }
}

public class LibraryDemo {
    public static void main(String[] args) {
     Library library = new Library();
        try {
//            library.borrowBook("John Doe", 7);
            library.borrowBook(null, 1);
        } catch (BookUnavailableException e) {
            e.printStackTrace(); // print exception in terminal
        }
        catch (Exception e) {
//            System.out.println("Exception Occurred");
//            e.printStackTrace();
             System.out.println(e.getMessage()); // gets the message passed in exception
        }
    }
}
