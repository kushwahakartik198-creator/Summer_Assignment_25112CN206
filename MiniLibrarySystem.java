import java.util.Scanner;

class Book {
    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
    }
}

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = null;
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    book = new Book(id, name);
                    System.out.println("Book Added Successfully");
                    break;

                case 2:
                    if (book != null)
                        book.display();
                    else
                        System.out.println("No Book Available");
                    break;
            }

        } while (choice != 3);

        System.out.println("Library Closed");
    }
}
