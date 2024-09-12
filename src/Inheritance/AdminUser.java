package Inheritance;

//child class
//code is prarent class can in child class
//code reuseabilty
public class AdminUser extends User{

    public AdminUser(String username ,String email){
        super(username,email);
 }

    public void manageProducts(){
        System.out.println("admin is managing products");

    }
    public void updateUser(){
        System.out.println(username+ "'s username needs to be updated");
    }

    @Override
    public  void showDashboard(){
        super.showDashboard();
        System.out.println("admin user specaliced dashboard");
    }
    public  static void main(String[] args){
        AdminUser au = new AdminUser("anshika","anshika@gmail.com");
        au.login();
        au.showDashboard();
    }

}
