package IterativeStatement;

public class IterativeStatementDemo {
//in computer programming loops are used to seprate a block of code
    // ->loop
    //->while loop
    //-> do while loop

    //->for loop is used to seen a block of code a certain no of times.
    //syntax:for(initial expression ; test expression: update){
    //
    // }
    public static void main(String[] args){
//
//        int n =10;
//
//        for(int i =1; i <=n;i++ ){
//            System.out.println("hello :" + i);
//        }
//
//int n = 25;
//for(int i =15; i <=n; ++i){
//    System.out.println("hey :"+ i);
//}
//        int n=1000;
//        for(int i = 1; i <=n;i++){
//            System.out.println(i);
//        }
         int sum = 0;
         int n =1000;
         for(int i =1 ; i <=n; i++){
             sum +=i;
         }
        System.out.println(sum);

    }
}
