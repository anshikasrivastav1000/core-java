package Array;

public class ArrayMin {

    public static  void main(String[] args){

        int[] no = {10,20,30,40,50}; //array bnao
        int min = no[0];//asuuume kro ki element ka phla no chota hai sbse

        for(int i = 0; i < no.length; i++){

            if(no[i] < min){
                min = no[i];
            }
        }
        System.out.println(min);



    }
}
