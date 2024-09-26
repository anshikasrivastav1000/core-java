package TwoDArray;

import java.util.Scanner;

public class SumOfDiagonalElement {
    public static  void main(String[] args){

        Scanner in = new Scanner(System.in);

        //setp 1 input size [row , col------->n];
        int n = in.nextInt();

        //step-2 create a 2D array
        int arr[][] = new int [n] [n];


        for (int i = 0; i<n; i++)//change row
        {

            for(int j =0; j<n ;j ++)//change colum
            {
                arr[i][j] =in.nextInt();

            }
        }
        /// left diagolnal  i ==j
        //right digonal ----i +j == n - 1
//step 3 find sum of diagonal element
      int sum = 0;
        for(int i =0; i <n;i++) //change row
             {
              for(int j = 0;j<n;j++) //change the col
              {
                  if(i == j || i +j == n -1) //n -->no ofrow
                  {
                      sum = sum + arr[i][j];
                  }
              }

        }
        System.out.println(sum);

    }
}
