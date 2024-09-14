package NastedLoops;

import java.util.Scanner;

public class Triangle2 {
    public  static  void main(String[] args){
        Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int space = row -1;
      int star = 1;
      for(int i =1;i<=row;i++)
      {
          for(int j =1 ;j<=space; j++){
              System.out.print(" ");
          }
          for(int j =1 ;j<= star;j++){
              System.out.print("*");
          }
          space = space -1;
          star = star +1;
          System.out.println( );

      }






        }


    }

