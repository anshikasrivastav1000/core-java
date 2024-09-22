package ArrayQuestions;

import java.util.Scanner;

public class SubArray {

    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i =0; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        for(int i = 0 ; i < n ; i++) //start point
             {
                 for(int  j = i; j <n ; j++)//end point
                 {
//sub array i ---> j
                    for(int k = i; k <=j; k++){
                        System.out.print(arr[k] + " ");
                    }
                     System.out.println();
                 }

        }
    }
}
