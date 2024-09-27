package TwoDArray;

import java.util.Scanner;

public class SumOfAllElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int arr[][] = new int[row][col];

        for(int i = 0; i <row;i++){

            for(int j =0; j <col; j++){
                arr[i] [j] = in.nextInt();
            }
        }

        for(int i = 0;i<row; i++){
            int sum = 0;
            for(int j = 0; j <col;j++){

                    sum = sum+ arr[i] [j];

            }
            System.out.println(sum);


        }

    }
}
