package IterativeStatement;

import java.util.Scanner;

//whenever we have to repeat certain statement several times is
//called loop.
//advantage:fast execution ,reusability,decress the line of code
//less memory space
//types of loop
//for,while,do,foreach
public class LoopingStatement {


    //for loop
    //it is use when we want perform initialiazation ,condition and iner/der
   // operation in single line.
    //while loop
    //while loop is a pre-test loop
    //it is used when we dont know the no of iterations in advance.
    //it is also know as entry control loop.
    //syntax==>
    //while(condition){
    // }

    // start ->condition->statement
    //jab tk condition true hota hai tb tk loop chlta hai jb condition false hota hai toh loop end ho jaata hai
    public  static  void main(String[] args){

        int n;
        System.out.println("enter value for condition ");
        Scanner ref = new Scanner(System.in);
        n=ref.nextInt();

        while(n >=0){
            System.out.println("hlo");
        }

    }
}
