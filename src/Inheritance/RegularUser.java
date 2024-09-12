package Inheritance;

public class RegularUser extends  User {
    public RegularUser(String username,String email){
        super(username,email);

    }
    public void browseProducts(){
        System.out.println("customer is Browsing products");
    }
    @Override
    public  void showDashboard(){
        System.out.println("regulal user ");
    }


}
