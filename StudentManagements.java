import java.util.Scanner;

public class StudentManagements {

    static String[] names = new String[5];
    static int[] marks = new int[5];
    static int count = 0;

    static void addStudent(String name, int mark) {
        if (count < 5) {
            names[count] = name;
            marks[count] = mark;
            count++;
            System.out.println("Student Added Successfully");
        } else {
            System.out.println("Database Full");
        }
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found");
            return;
        }

        System.out.println("\nStudent Records:");

        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }

    static void searchStudent(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Found: " +
                        names[i] + " Marks: " + marks[i]);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int mark = sc.nextInt();

                    addStudent(name, mark);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Name To Search: ");
                    String search = sc.nextLine();

                    searchStudent(search);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}
