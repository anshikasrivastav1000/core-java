package TypeCasting;

//converting one data type to another datatype is called typecasting
//types 1: implicit 2:explicit
//1:implicit => it is automaticalllly performed by compliler
///smaller data type to bigger one;
//2:explicit =>by default the compiler ,does'nt allow the explicit typecasting
//bigger one to smaller one.



public class TypeCastingInJava {

   public static void main(String[] args){
       //implicit typecasting
       int a = 10; // 4 bytes
       double b =a; // 8 bytes
       System.out.println(b);
       //explicit typecasting
       double x =10.5;
       int y = (int)x;
       System.out.println(x);

   }
}
