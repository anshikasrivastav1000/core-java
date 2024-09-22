package Function;

import java.util.Scanner;

public class SumOfDigits {
        public static int sumOfDigit(int n){

       int sum = 0;
       while(n >0){
           int lastdigit = n % 10;
           sum = sum +lastdigit;
         n =n/10;

       }
   return sum;
        }

      public static  void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

          System.out.println(sumOfDigit(n));



      }
}
