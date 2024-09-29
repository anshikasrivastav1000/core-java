package String;

import java.util.Scanner;

public class InputAnString {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

//        String word = in.next(); //print a only one word
        String word = in.nextLine();//print a sectence
        System.out.println(word);
        System.out.println(word.length());

//        System.out.println(word.charAt(0));
        //print all letter in differrent line

        for(int i = 0;i < word.length();i++){
            System.out.println(word.charAt(i));
        }
    }
}
