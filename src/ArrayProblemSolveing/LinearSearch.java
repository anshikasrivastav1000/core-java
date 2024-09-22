package ArrayProblemSolveing;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int answer = -1; // assumpition method
        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                answer =i;
                break;
            }
        }
        System.out.println(answer);
    }
}
