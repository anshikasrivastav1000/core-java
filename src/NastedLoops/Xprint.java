package NastedLoops;

import java.util.Arrays;
import java.util.Scanner;

public class Xprint {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         //upper part
        int leftspace = 0;
        int middlespace = 1 + (n-2)*2;

        for(int i =1;i<=n;i++){
            //leftspace
            for(int j =1 ; j<=leftspace;j++){
                System.out.print(" ");
            }
            System.out.print(i);


            //middlespace
            for(int j = 1; j<=middlespace;j++){
                System.out.print(" ");
            }
            if(i!=n)
                System.out.print(i);
            leftspace= leftspace+1;
            middlespace= middlespace -1;
            System.out.println();

        }

        leftspace = n-2;
        middlespace = 1;
//lower part
        for(int i = n-1;i>=1;i--){
            //leftspace
            for(int j =1 ; j<=leftspace;j++){
                System.out.print(" ");
            }
            System.out.print(i);


            //middlespace
            for(int j = 1; j<=middlespace;j++){
                System.out.print(" ");
            }
            if(i!=n)
                System.out.print(i);
            leftspace= leftspace-1;
            middlespace= middlespace +1;
            System.out.println();

        }
    }
}
