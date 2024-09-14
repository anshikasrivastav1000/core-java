package NastedLoops;

import java.util.Scanner;

public class ReverseNoPrint {

    public  static  void  main(String[] args){


        Scanner in = new Scanner(System.in);

        int row = in.nextInt();

        for(int i =1 ;i<=row;i++){
            for(int j =i;j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }


}
