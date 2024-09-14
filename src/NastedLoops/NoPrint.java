package NastedLoops;

import java.util.Scanner;

public class NoPrint {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();

        for(int i =1 ;i<=row;i++){
            for(int j =i; j<= row;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
