package OOPS1;

public class Bicycle {

    public int gear =5;

    public void braking(){
        System.out.println("Brakiiing");
    }

    public static void main(String[] args){
        Bicycle sportsbicycle = new Bicycle();

        System.out.println(sportsbicycle.gear);
        sportsbicycle.braking();
    }


}

