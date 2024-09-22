package ArrayQuestions;

import java.util.Scanner;

public class ArrayOddEvenElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        // Counting even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                countEven++;
            else
                countOdd++;
        }

        // Printing even numbers
        if (countEven > 0) {
            System.out.println("Even numbers:");
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        // Printing odd numbers
        if (countOdd > 0) {
            System.out.println("Odd numbers:");
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        // Closing the scanner to prevent resource leak
        in.close();
    }
}

