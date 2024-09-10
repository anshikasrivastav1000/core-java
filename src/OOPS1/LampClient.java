package OOPS1;

public class LampClient {
    public static void main(String[] args){

//state
        Lamp Led = new Lamp();
        Lamp halogen = new Lamp();
//behavior
        Led.turnOn();
        halogen.turnOn();
    }
}
