package Function;
// Parameters act as variables inside the method.
//Parameters are specified after the method name, inside the parentheses.
// You can add as many parameters as you want,
// just separate them with a comma.
//void means that this method does not have a return value.
// in java there can be two function with same name but with different Parameters.









public class Function {
    public static  void main(String[] args){
        //calling a function
//greetings();  //if i run the function which is on line 6 then this code jump to the function before excution of line no 7
        System.out.println("see you around");
        addTwoNo(10,10);


    }



//declaring a function
//    public static  void greetings(){
//
//        System.out.println("hey there");
//        System.out.println("hope you are doing well");
//    }




    public  static void addTwoNo(int val1,int val2){
        int sum =val1 + val2;
        System.out.println(sum);
    }
}
