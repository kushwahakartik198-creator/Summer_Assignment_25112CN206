import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest = -1;

        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                largest = i;
                n /= i;
            }
        }

        System.out.println(largest);
    }
}