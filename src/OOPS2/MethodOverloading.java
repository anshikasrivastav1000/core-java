package OOPS2;

public class MethodOverloading {
    public static int Sum(int a, int b){
        return a+b;
    }
    public static double Sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(Sum(5,6));
        System.out.println(Sum(5.1,6.1));
    }
}
