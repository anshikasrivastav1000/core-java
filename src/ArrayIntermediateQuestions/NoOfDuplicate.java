package ArrayIntermediateQuestions;

import java.util.Scanner;

public class NoOfDuplicate {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // Size of the array

        int arr[] = new int[n];  // Array declaration

        // Input the array elements
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Initialize maximumNumber with the first element instead of 0
        int maximumNumber = arr[0];
        for(int i = 1; i < n; i++) {
            maximumNumber = Math.max(maximumNumber, arr[i]);
        }

        // Frequency array to track the count of each number
        int fre[] = new int[maximumNumber + 1];
        for (int i = 0; i < n; i++) {
            fre[arr[i]]++;
        }

        // Count duplicates
        int count = 0;
        for(int i = 0; i < maximumNumber + 1; i++) {
            if(fre[i] >= 2) {
                count++;  // Count how many numbers have duplicates
            }
        }

        // Print the number of duplicate elements
        System.out.println(count);
    }
}
