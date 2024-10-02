package String;

public class ReverseAnArray {
    public static  void main(String[] args){
        String s = "abcdefg";
         int l = s.length();

         StringBuilder answer = new StringBuilder("");

         for(int i = 0; i >= 0;i --){
             answer.append(s.charAt(i));
         }
        System.out.println(answer.toString());

    }
}
