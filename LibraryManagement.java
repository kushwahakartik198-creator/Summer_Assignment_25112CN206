import java.util.ArrayList;

class Book {
    String title;
    boolean issued;

    Book(String title) {
        this.title = title;
        this.issued = false;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Java Programming"));
        books.add(new Book("Python Basics"));

        // Issue Book
        String bookToIssue = "Java Programming";

        for (Book b : books) {
            if (b.title.equals(bookToIssue) && !b.issued) {
                b.issued = true;
                System.out.println(bookToIssue + " issued successfully.");
            }
        }

        // Display Books
        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            System.out.println(b.title + " - " +
                    (b.issued ? "Issued" : "Available"));
        }
    }
}
