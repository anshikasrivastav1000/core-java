//package Function;
//
//import java.util.Scanner;
//
//public class PrimeNo {
//    public static boolean isPrime(int n) {
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//
//        if(count ==2){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    public static void printPrime(int start, int end){
//        for(int i=start; i<end;i++){
//           if(isPrime(i) == true){
//               System.out.println(i+"");
//           }
//        }
//
//    }
//    public static  void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int start = in.nextInt();
//        int end = in.nextInt()
//    }
//
//}
