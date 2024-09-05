package L3;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static  void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.println("check no is postive ,negittive or zero");
        int Check = inp.nextInt();

        if(Check > 0){
            System.out.println("Postive");
        } else if (Check < 0) {
            System.out.println("Negitve");
            
        }else {
            System.out.println("Zero");
        }
    }
}
