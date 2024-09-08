package Array;

public class ArraySum {
    public static  void main(String[] args){
        int[] no ={10,20,30,40,50}; //array inzilize kro
        int sum =0;   // ek variable bnao jiska value 0 ho
        for(int i = 0 ; i <no.length;i++){ //array element ko acess kro
            sum+=no[i]; //jo varable bnae ho usme + krdo acces kiye gaye element ko
        }
        System.out.println(sum);    //print krdo
    }
}
