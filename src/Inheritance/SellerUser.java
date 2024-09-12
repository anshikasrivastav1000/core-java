package Inheritance;

public class SellerUser extends User {
    public SellerUser(String username,String email){
        super(username,email);
    }
    public void addProducts(){
        System.out.println("seller is adding a new products");
    }
    @Override
    public  void showDashboard(){
        System.out.println("seller user personalized dashboard");
    }

}
