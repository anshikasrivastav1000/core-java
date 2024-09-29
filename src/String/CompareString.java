package String;

public class CompareString {
    public static void main(String[] args){
    String a = "abc";
    String b = "dfe";
        System.out.println(a.compareTo(b));

        //A -----------Z (65 --- 90);
        //'a'--------b(97 -------122);
        if(a.compareTo(b) < 0){
            System.out.println("b is bigger");
        }
        else if(a.compareTo(b) > 0){
            System.out.println("a is bigger");
        }
        ///- maths--->('a' -->97,'e' --->101)
        System.out.println('a' - 'e');
    }

}
