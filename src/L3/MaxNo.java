package L3;

import java.util.Scanner;

public class MaxNo {


    public static  void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        System.out.println("enter any two no to find max no");


        int No = inp.nextInt();
        int No2 = inp.nextInt();
        int No3 = inp.nextInt();

        if(No >= No2 && No2 >= No3   ){
            System.out.println(No);
        } else if (No2 >= No &&  No >= No3 ) {
            System.out.println(No2);

        }else {
            System.out.println(No3);
        }


    }
}

