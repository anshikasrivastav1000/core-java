package Array;

import static java.util.Collections.swap;

public class FunctionOfAnArrya {
    public static  void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr);
        //get
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
//he output is 0, 0, 0, 0, 0 because the array was
// created and initialized with default values,
// and the default value for an integer (int) is 0.

        //set
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


//enhanced for loop is forward only and read only
        System.out.println("enhanced for loop");
        for (int val : arr) {
            System.out.println(val);


        }
        int i = 0;
        int j = 2;
        System.out.println((arr[i] + "," + arr[j]));
        Swap(arr[i], arr[j]);
        System.out.println(arr[i] + "," + arr[j]);


        System.out.println("--------case2---------");
        int[] other ={100,200,300};
        System.out.println(arr[0] +"," + other[0]);
        Swap(arr,other);
        System.out.println(arr[0] +"," + other[0]);
    }
    public static void Swap(int[] one, int[] two){
        int[] temp = one;
        one = two;
        two = temp;
    }

public static void Swap(int one,int two){
    int temp = one;
    one =two;
    two =temp;

        }




    }
