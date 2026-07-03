import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {3, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr1)
            set.add(x);

        for (int x : arr2)
            set.add(x);

        System.out.println(set);
    }
}