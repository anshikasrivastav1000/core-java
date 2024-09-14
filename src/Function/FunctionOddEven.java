package Function;

public class FunctionOddEven {
    public static boolean evenorodd(int n){
        if( n % 2==0){
            return true;
        }else{
            return false;
        }
    };
    public static  void main(String[] args){
       boolean result = evenorodd(55);
        System.out.println(result);
    }

}
