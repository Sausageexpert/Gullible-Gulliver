package encapsulation;

public class bankAccount {
    private double balance; // don't want everyone to be seeing this so make it private
    public void deposit(double amount){ // a well-defined interface, can access even private variables
        balance+=amount;
    }
    public void withdraw(double amount){ // also a well-defined interface
        if(balance>amount){
            balance-=amount;
        }
        else{
            System.out.println("sadly enough, you won't be able to buy dolls (sad indeed)");
        }
    }
    public double getBalance(){
        return balance;
    }
}
