package ArrayIntermediateQuestions;

import java.util.Scanner;

public class Question {

    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //create 2 D array
        //datatype arrayName[][] = new datatype[row][col]
        int arr[][] = new int[n][n];

        for(int i = 0;i<n;i++)
        {
            for(int j =0; j <n; j++){
                arr[i][j] = in.nextInt();
            }
        }
// differrent type of movement ------two pointer
        int row = 0;
        int leftColumn =0;
        int rightColumn =n-1;

        while(row < n && leftColumn < n){
            //swap-->arr[row][col] arr[row] [n -1-col]
           int temp = arr[row][leftColumn];
           arr[row][leftColumn] =arr[row][rightColumn];
            arr[row][rightColumn]= temp;
            row++;
            leftColumn++;
            rightColumn--;
        }
        for (int i = 0; i<n; i++)//change row
        {

            for(int j =0; j<n ;j ++)//change colum
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
