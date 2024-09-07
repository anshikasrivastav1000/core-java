package Array;
//Swap method, arrays ke references ko sirf
// temporarily method ke andar swap karta hai,
// lekin original arrays ko method ke bahar kuch asar nahi hota.

public class Swap {


    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

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

//Jab aap method call karte hain, jaise ki Swap(arr, other);
// , toh us method ko parameters pass kiye jaate hain usi
// sequence mein jo aap method definition mein specify
// karte hain. Yaani, pehla parameter arr method ke pehle
// parameter one ko assign hota hai, aur dusra parameter
// other method ke dusre parameter two ko assign hota hai.


//Yahan pe, arr aur other arrays ko Swap method mein pass kiya jaa raha hai.
//Java yeh decide karta hai ki pehla parameter (arr)
// one ko milega aur
// dusra parameter (other) two ko milega.
