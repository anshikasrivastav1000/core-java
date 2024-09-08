package Array;

public class ArrayReverse {

    public static void main(String [] args){
        int[] no = {10,20,30,40,50};

        System.out.println("real array");

        for(int i = 0 ; i < no.length;i++){
            System.out.println(no[i] + "");
        }

        //reverse an array

        int i = 0;
        int j = no.length - 1;
        while (i < j){
            int temp = no[i];
            no[i] = no[j];
            no[j] = temp;
            i++;
            j--;

        }
        System.out.println("reverse array");
        for( int k = 0; k < no.length;k++)
        {
            System.out.println(no[k]);
        }


    }
}
