import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Java is a ?");
        System.out.println("1. Language  2. Browser  3. OS  4. Database");
        int ans1 = sc.nextInt();

        if (ans1 == 1)
            score++;

        System.out.println("Q2. Size of int in Java?");
        System.out.println("1. 2  2. 4  3. 8  4. 16");
        int ans2 = sc.nextInt();

        if (ans2 == 2)
            score++;

        System.out.println("Q3. Which keyword is used for inheritance?");
        System.out.println("1. this  2. static  3. extends  4. super");
        int ans3 = sc.nextInt();

        if (ans3 == 3)
            score++;

        System.out.println("Final Score = " + score + "/3");

        sc.close();
    }
}
