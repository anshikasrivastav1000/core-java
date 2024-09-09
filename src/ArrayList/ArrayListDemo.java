package ArrayList;
import java.util.ArrayList;
// it allow us to create resixeable array
//dynamic arrays

public class ArrayListDemo {

    public static  void main(String[] args){
        //ArrayList<Type> arraylist = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> languages  = new ArrayList<>();

        //add elements
        languages.add("java");
        languages.add("c");
        languages.add("js");
        languages.add(1,"c++");
        System.out.println(languages);

        //access
        String str = languages.get(1);
        System.out.println(str);

        //change
        languages.set(1,"pyton");
        System.out.println(languages);

        //remove
        languages.remove(2);
        System.out.println(languages);
        System.out.println("------" +
                "-----");
        //iteration
        for(String language :languages){
            System.out.println(language);
        }


    }
}
