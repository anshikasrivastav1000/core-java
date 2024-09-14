package Function;
//public is access specifier
//static

public class UseCaseOfFunction {
    public static  int sum(int x ,int y) {
        int sum =x+y;
        return sum;

    };


    public static  void main(String[] args){
int a =5;
int b=5;
int result = sum(a,b);
        System.out.println(result);
    }


}
