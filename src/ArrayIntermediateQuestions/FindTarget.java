package ArrayIntermediateQuestions;

import java.util.Scanner;

public class FindTarget {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];


        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();

        }
        int answer = -1; //yha asume krna hai ki target value array me hai hi nhi nhi hoga toh -1 answer aaye ga

        for(int i = 0; i<n ; i++){

            if(arr[i] == k){
                answer = i;
                break;
            }


        }
        System.out.println(answer);




    }
}
