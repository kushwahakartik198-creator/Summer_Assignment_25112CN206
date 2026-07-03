import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n--- String Menu ---");
            System.out.println("1. String Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 4:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reversed String = " + rev);
                    break;
            }

        } while (choice != 5);

        System.out.println("Program Ended.");
    }
}
