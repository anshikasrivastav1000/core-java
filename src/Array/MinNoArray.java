package Array;



public class MinNoArray {
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50};
        mixmumEle(arr);




    }
    public static void mixmumEle(int[] arr){
        int min = Integer.MAX_VALUE;
    for(int i =0 ;i < arr.length;i++){
        if(arr [i] < min){
            min =arr[i];
        }
    }
        System.out.println(min);
    }
}
