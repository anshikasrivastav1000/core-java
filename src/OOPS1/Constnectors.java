package OOPS1;
// a consytotor in java is similar to a method that is
// invoked when an object of the class created.
//a constrtor has the same ame as that of the class and does not
//have any return type
//class test{
//test(){

//}
// }
//TYPES OF CONSTRUTOR
//1 no -arg construtor
//2 paramtnised construtor
//3 default construtor

public class Constnectors {
    private  String name;

    Constnectors(){
        System.out.println("construtor called");
        name = "algo camp";
    }
    Constnectors(String lang){
        name= lang;
        System.out.println(name +"is a programming language");
    }

    public  static void main(String[] args){
        Constnectors obj = new Constnectors();
        System.out.println("this name is" + obj.name);

        Constnectors obj1 =new Constnectors("java");

    }


}
