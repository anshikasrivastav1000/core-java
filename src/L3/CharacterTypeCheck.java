package L3;

import java.util.Scanner;

public class CharacterTypeCheck {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Check no or charachter ");

        String userInput = scn.nextLine();
        System.out.println(userInput);

        if(userInput.length()>1 ){
             System.out.println("enter value is number"+ userInput);

        }else {
            char enterValue = userInput.charAt(0);
            if(Character.isDigit(enterValue)){
                System.out.println("enter value is number"+ userInput);
            }else {
                System.out.println("enter value is Character"+ userInput);
            }
        }






    }
}
