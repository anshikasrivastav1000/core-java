package NastedLoops;

import java.util.Scanner;

public class TriangleStarPrint {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int row = inp.nextInt();
for(int i = 1 ;i <=row;i=i+1){
    for (int j = 1;j<=i;j=j+1){
        System.out.print("*");
    }
    System.out.println();
}

    }
}
