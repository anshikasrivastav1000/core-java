package NastedLoops;

import java.util.Scanner;

public class NoPrint1 {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();

        for(int i =1 ;i<=row;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        //lowerpart
        for(int i = row-1; i >=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }

}
