package Array;
import java.util.Scanner;
public class ArrayLinearSeacrh {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                found = true;
                System.out.println("Number " + key + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + key + " not found in the array.");
        }
    }
}
