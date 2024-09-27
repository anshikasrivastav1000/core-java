package MultidimensionalArrays;

import java.util.Scanner;

public class Matrix {
    public static void move(int R,int C, int arr[][], int col){

        //row decreace
        //col increase

        while(R >=0 && C < col ){
            System.out.print(arr[R][C]+ " ");

            R--;
            C++;
        }
        System.out.println();
    }
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int arr[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j = 0; j<col ;j++){
                arr[i][j] = in.nextInt();
            }
        }

        //logic
        ///1st step starting point
        for(int i = 0;i<row;i++){
            int R = i;
            int C =0;
            move(R,C,arr,col);

        }
        for(int j =1; j<col;j++){
            int R = row - 1;
            int C = j;
            move(R,C,arr,col);
        }


    }
}
