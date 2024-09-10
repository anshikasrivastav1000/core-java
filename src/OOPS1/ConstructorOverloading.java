package OOPS1;

public class ConstructorOverloading {
    //we can have two or more construtor with different paramenters

    String lang;

    ConstructorOverloading(){
        lang="java";
    }
    ConstructorOverloading(String js){
        lang="js";
    }
  public   void getName(){
      System.out.println(lang);
  }

}
