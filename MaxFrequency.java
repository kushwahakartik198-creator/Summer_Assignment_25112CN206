public class MaxFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 2, 4, 4};

        int maxCount = 0;
        int element = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                element = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element: " + element);
    }
}