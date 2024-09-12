package Inheritance;
//this is super class
//super class mean is that this kind of funcanilty will be available for every user
//parent class
public class User {
    protected String username;
    protected String email;
    public  User(String username,String email){
        this.username = username;
        this.email = email;
    }
    public void login(){
        System.out.println(username+ "logged in");
    }
    public void showDashboard(){
        System.out.println(username + "'s dashboard");
    }
}
