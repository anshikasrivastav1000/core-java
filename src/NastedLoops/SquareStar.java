package NastedLoops;

import java.util.Scanner;

public class SquareStar {

    public static  void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int row = inp.nextInt();

      int  space = 0;
      for(int i = 1 ;i<=row;i++){

          for(int j = 0 ; j<=i; j++){
              System.out.print("* ");
          }
          space = space+1;
          System.out.print(" ");

      }
    }
}
