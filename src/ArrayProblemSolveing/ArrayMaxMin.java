package ArrayProblemSolveing;

import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Enter the number of elements:");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return; // Exit if the array size is invalid
        }

        int arr[] = new int[n];

        // Prompting the user to enter array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Initializing max with the first element
        int max = arr[0];

        // Finding the maximum value in the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Printing the maximum value
        System.out.println("Maximum number in the array is: " + max);

        // Closing the Scanner
        in.close();
    }
}
