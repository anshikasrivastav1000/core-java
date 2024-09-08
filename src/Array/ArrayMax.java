package Array;

public class ArrayMax {
    public static void main(String[] args){

        int[] no = {2,4,6,8,10};   ///array inzelize kro
        int max = no[0]; //ek varable bnao or assume kro ki wo maximum hai

        for(int i =0; i < no.length;i++){    //array ki elements ko acces kro
            if (no[i] > max) {
                max = no[i];


            }

        }
        System.out.println(max);
    }
}
