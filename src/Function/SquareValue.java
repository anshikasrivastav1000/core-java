package Function;

public class SquareValue {
    public static  void  main(String[] args){

        for(int i =1 ;i <=5;i++){
        int res = getSquare(i);
            System.out.println("square of " + i + "is" + res);
        }

    }
    public static  int getSquare(int x){
        return x * x;
    }
}
