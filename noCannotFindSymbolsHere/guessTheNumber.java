package noCannotFindSymbolsHere;

import java.util.Random;
import java.util.Scanner;
public class guessTheNumber {
    public static void main(String[] args){
        Random answer = new Random();
        Scanner inputBox = new Scanner(System.in);
        int ans = answer.nextInt(100);
        int chances=4;
        while (chances>0){
            System.out.print("Enter your guess ");
            int guess = inputBox.nextInt();
            if (guess>ans){
                System.out.println("congratulations! your number was greater than the number we chose... you should be proud :)");
                break;
            }
            else{
                System.out.println("could the answer be... 5?");
            }
            chances=chances-1;
        }

        System.out.println("As much as we'd love to cruelly make you keep guessing random numbers, Gullible wants to take a nap so byeee ");

    }
}
