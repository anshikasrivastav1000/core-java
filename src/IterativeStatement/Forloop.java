package IterativeStatement;

import java.util.Scanner;

public class Forloop {

    public static void main(String[] args){
//default value condition ki true hoti hai
//        int n = 10;
//
//        for( int i = 1; i <= n ; ){
//
//            n--;
//            System.out.println(i);
//        }

        Scanner scannerObj = new Scanner(System.in);


        for(int i = 0;i==0  ; ){
            System.out.println("enter age");
            int age = scannerObj.nextInt();
            System.out.println("enter country");
            scannerObj.nextLine();
            String country = scannerObj.nextLine();

            if( age >=18 && country.toLowerCase().equals("india") ){
                System.out.println("eligible");

            }
            else{
                System.out.println("not eligible");
            }

        }




    }
}
