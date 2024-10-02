package String;

import java.util.Scanner;

public class Palindrome  {
    public static  void main(String[] args){

        String s = "a b c c b a";
        int i = 0;
        int j = s.length()-1;

       boolean flag = true;
       while (i <j){
           if(s.charAt(i) == s.charAt(j)){
               flag = false;

           }
           i++;
           j--;
       }

       if(flag == true){
           System.out.println(flag);
       }else{
           System.out.println("not palidrome");
       }
    }


}
