package noCannotFindSymbolsHere;

import java.util.Scanner;
public class restaurant {
    public static void main(String[] args){
        System.out.println("Welcome to Super Sausages, my Viennese noCannotFindSymbolsHere.restaurant I definitely have been managing lately ");
        System.out.print("How many people want sausages? We know the whole world does but it's polite to ask :) ");
        Scanner inputBox = new Scanner(System.in);
        int people = inputBox.nextInt();
        int sausage_supply=10;
        int bill = sausage_supply*5;
        System.out.println("Number of sausages per person = "+(sausage_supply/people));
        System.out.println("Amount to be paid by each if you're going Dutch = "+(bill/people));
    }
}
