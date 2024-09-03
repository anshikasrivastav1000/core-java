package L3;

import java.util.Scanner;

public class MaximumNo {
    public static  void main(String[] args){
        Scanner scn = new Scanner(System.in);

      int inp = scn.nextInt();
        int inp2 = scn.nextInt();
        int inp3 = scn.nextInt();




        if(inp >= inp2 && inp2 >= inp3 ){
            System.out.println(inp);
           } else if (inp2 >= inp && inp>= inp3) {
            System.out.println(inp2);

        }
        else{
            System.out.println(inp3);
        }


    }
}
