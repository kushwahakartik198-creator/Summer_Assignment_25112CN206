import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\nStudent Records");
        System.out.println("ID\tName\tMarks");

        for (int i = 0; i < n; i++) {
            System.out.println(id[i] + "\t" + name[i] + "\t" + marks[i]);
        }

        sc.close();
    }
}
