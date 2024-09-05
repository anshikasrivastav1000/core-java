package L3;

import java.util.Scanner;

public class GradeCalculation {
    public static void main( String[] args){


        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks = inp.nextInt();

        if(marks >= 90){

            System.out.println("A" +marks);
        } else if (marks >= 80) {
            System.out.println("B" + marks);

        }else {
            System.out.println("C" + marks);
        }
    }
}
