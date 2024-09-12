package Abstract;


public class OnlineStore {
    public  static  void main(String[] args){
        Product electronics = new Electronics("SmartPhone",50000);
        Product Clothing = new Clothing("T-shirt",500);
        System.out.println(electronics.calculateTax());
        System.out.println(Clothing.calculateShipping());
    }

}
