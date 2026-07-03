import java.util.Arrays;
import java.util.Comparator;

public class SortWordsByLength {
    public static void main(String[] args) {

        String words[] = {"Java", "Programming", "C", "Python"};

        Arrays.sort(words, Comparator.comparingInt(String::length));

        for (String word : words)
            System.out.println(word);
    }
}
