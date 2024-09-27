package TwoDArray;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class SumofRowElement {

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
//step 3 print the column
        for (int j = 0; j<row; j++)//column fix
        {
            for(int i =0; i<col ; i++)//change row
            {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }

    }

}
