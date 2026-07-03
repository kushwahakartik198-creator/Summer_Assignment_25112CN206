import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empId = new int[n];
        String[] empName = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\nEmployee Details");
        System.out.println("ID\tName\tSalary");

        for (int i = 0; i < n; i++) {
            System.out.println(empId[i] + "\t" + empName[i] + "\t" + salary[i]);
        }

        sc.close();
    }
}
