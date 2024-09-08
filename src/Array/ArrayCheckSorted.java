package Array;

public class ArrayCheckSorted {


    public static void main(String[] args){


        int[] no ={2,4,6,8,10};
        boolean isSorted = true; // yha pr assume kiye hai ki array jo hai wo soretd hai


         for(int i = 0 ; i < no.length-1 ; i++){

             if (no[i] > no[i +1]) {
                 isSorted=false;
                 break;

             }
         }

         if(isSorted){
             System.out.println("Array is sorted in ascending order");
         }else {
             System.out.println("array is not sorted");
         }



    }
}
