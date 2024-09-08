package Array;

public class ArrayCountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5, 2};
        int key = 2;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                count++;
            }
        }

        System.out.println("Number " + key + " occurs " + count + " times in the array.");
    }
}
