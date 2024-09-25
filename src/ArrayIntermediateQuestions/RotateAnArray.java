package ArrayIntermediateQuestions;

import java.util.Scanner;

public class RotateAnArray {

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int arr[] = new int[n];
int k = in.nextInt();
    for(int i = 0; i < n ; i++){
   arr[i] = in.nextInt();
    }
    int reversed[] = new int[n];

    k = k%n;

    for(int i = 0; i <n; i++){
        int newIndex = (i -k );
        if(newIndex < 0){
            newIndex +=n;
        }
        reversed[newIndex] = arr[i];
    }
    for(int i = 0; i<n; i++)
    {
        System.out.print(reversed[i] + " ");
    }
}}
