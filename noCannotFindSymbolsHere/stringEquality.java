package noCannotFindSymbolsHere;
import java.util.Scanner;

public class stringEquality {
    public static void main(String[] args){
        System.out.println("Type any food you'd like ( we're going to assume it's pasta anyway :) )");
        Scanner inputBox = new Scanner(System.in);
        String food = inputBox.next();
        if (food.equals("pasta")){ // the regular == won't work because they're stored in different memory locations (strings are mutable)
            System.out.println("You are eating officially verified (and tasted) pasta ");
        }
        else{
            System.out.println("You are probably eating an idli from Italy but please go ahead");
        }
    }
}


