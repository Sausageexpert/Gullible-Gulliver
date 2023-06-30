package noCannotFindSymbolsHere;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double no1 = input.nextDouble();
        System.out.println("Enter the second number");
        double no2 = input.nextDouble();
        System.out.println("Enter the operation");
        char operation = input.next().charAt(0); // takes the char at array position 0
        switch(operation){
            case '+':
                System.out.println("Sum is "+(no1+no2));
                break;
            case '-':
                System.out.println("Difference is "+ (no1-no2));
                break;
            case '*':
                System.out.println("Product is "+ (no1*no2));
                break;
            case '/':
                if(no2==0){
                    System.out.println("nope");
                }
                else {
                    System.out.println("Quotient is " + (no1 / no2));
                }
                break;
        }
    }
}
