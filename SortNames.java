import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {

        String names[] = {"Kartik", "Aman", "Rohit", "Zoya"};

        Arrays.sort(names);

        for (String name : names)
            System.out.println(name);
    }
}
