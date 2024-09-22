package ArrayQuestions;

import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args){

   Scanner in = new Scanner(System.in);

   int n  = in.nextInt();
   int arr[] = new int[n];
   for(int i = 0; i < n; i++){
     arr[i] = in.nextInt();
}
   int value = in.nextInt();
   int position = in.nextInt();

   int answer[] = new int[n+1];

   int i = 0;
   int j = 0;

   while(i<n + 1){
       if(i == position -1){
           answer[i] = value;
       }
       else{
           answer[i] = arr[j];
           j++;
       }
       i++;
   }
   i = 0;
   while(i < n + 1){
       System.out.println(answer[i] + " ");
       i++;
   }

    }
}
