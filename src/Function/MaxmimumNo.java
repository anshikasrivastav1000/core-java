package Function;

public class MaxmimumNo {

    public static int maxNo(int a, int b){

        if(a>b) {
        return  a;
        }else{
            return b;
        }
        }




public static int minNo(int a, int b){

    if(a<b) {
        return  a;
    }else{
        return b;
    }
}




    public static void main(String[] args){
    int a = 5;
    int b =10;

        System.out.println(maxNo(a,b));
        System.out.println(minNo(a,b));
    }

}
