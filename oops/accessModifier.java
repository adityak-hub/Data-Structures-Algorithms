package oops;

public class accessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aditya Kumar";
        myAcc.setpassword("abcd");
    }
    
}



class BankAccount{
    public String username;

    private String password;

    public  void setpassword(String pwd) {
        password = pwd; 
    }
    

}