import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Student Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nStudent Records:");

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }
}
