package encapsulation;

public class Main {
    public static void main(String[] args){
        bankAccount pavBhaji = new bankAccount();
        pavBhaji.deposit(20000); // 20 in thousands of dollars
        pavBhaji.withdraw(1); // buying a chang kee curry puff
        System.out.println("pav bhaji's balance is: "+pavBhaji.getBalance());

        // System.out.println(pavBhaji.balance); won't work because it has private access because of encapsulation
    }
}
