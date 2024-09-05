package L3;

import java.util.Scanner;

public class LeapYear {
   public static void main(String [] args){
       Scanner inp = new Scanner(System.in);
       System.out.println("check whether its leap year or not");
       int year = inp.nextInt();

       if(year % 400 == 0  ){
           System.out.println(year + "leap year");
       } else if (year % 100 ==0) {
           System.out.println(year + " not leap year");

       } else if (year % 4==0) {
           System.out.println(year  + "leap year" );

       }
       else{
           System.out.println("not leap year");
       }


//       if((year % 4 ==0 ) &&(year % 100 != 0)|| (year % 400 == 0)){
//           System.out.println("leap year");
//        }
//       else{
//           System.out.println("not leap year");
//       }

   }

}
