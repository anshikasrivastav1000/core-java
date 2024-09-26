package TwoDArray;

import java.util.Scanner;

public class SquareMatrix {
    public static  void main(String[] args){

        Scanner in = new Scanner(System.in);

        //setp 1 input size [row , col];
        int row = in.nextInt();
        int col = in.nextInt();
        //step-2 create a 2D array
        int arr[][] = new int [row] [col];


        for (int i = 0; i<row; i++)//change row
        {

            for(int j =0; j<col ;j ++)//change colum
            {
                arr[i][j] =in.nextInt();

            }
        }
//step 3 find sum of an element

        int sum =0;
        for (int i = 0; i<row; i++)//change row
        {

            for(int j =0; j<col ;j ++)//change colum
            {
               sum = sum + arr[i][j];

            }
        }
        System.out.println(sum);



    }

}
