package String;

public class AppendString {
    public static  void main(String[] args){
        String s = "";
        s = s + "a";
        s = s + "b";
        s = s + "c";
        System.out.println(s);

        StringBuilder str = new StringBuilder("");
        str.append("a");
        str.append("b");
        str.append("c");


    }
}
