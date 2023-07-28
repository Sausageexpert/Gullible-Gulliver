package noCannotFindSymbolsHere;

import java.util.Scanner;
public class conditions {
    public static void main(String[] args){
        System.out.println(3>5); // outputs false
        if (2.2==2.25){ // using 'false' as an argument would also give the same output, using true would give the opposite
            System.out.println("This won't be printed anyway so I can really type anything here");
        }
        else{
            System.out.println("This is definitely going to be printed... as long as I said my best prayers before running");
        }
        Scanner inputBox = new Scanner(System.in);
        System.out.println("Welcome to the Lilliput ride which Lilliputians cant really ride on because none of them are between 130 and 210 centimetres. Any injuries caused by knocking over doll-sized figures is not the company's responsibility");
        System.out.print("Enter your height here ");
        int height = inputBox.nextInt();
        if (height<130 || height>210){
            System.out.println("This ride has been closed due to unfortunate weather... it is too bright and sunny");
        }
        else if(height==150){
            System.out.println("Congratulations, lucky customer! You have won our 'be 150 cms tall' award of one free roller coaster ride :)");
        }
        else{
            System.out.println("We don't really care much about the weather as long as we can ride the roller coaster so hop on!");
        }

    }
}
