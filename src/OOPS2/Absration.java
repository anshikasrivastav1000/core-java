package OOPS2;
interface Drinks{
public    void getName();
    public void drinkFelling();
}
class  Water implements Drinks{
    public  void  getName(){
        System.out.println("water");
    }
    public  void  drinkFelling(){
        System.out.println("goood");
    }
    class Milk implements Drinks{
        public   void  getName(){
            System.out.println("water");
        }
        public   void  drinkFelling(){
            System.out.println("water");
        }
    }
}
public class Absration {
    public static void main(String[] args) {
        // Creating an instance of Water
        Water obj = new Water();
        obj.getName();           // Calling getName() method on Water object
        obj.drinkFelling();      // Calling drinkFelling() method on Water object

        // Creating an instance of Milk (inner class)
        Water.Milk obj2 = obj.new Milk();  // Since Milk is an inner class, we instantiate it through Water
        obj2.getName();         // Calling getName() method on Milk object
        obj2.drinkFelling();    // Calling drinkFelling() method on Milk object
    }
}
