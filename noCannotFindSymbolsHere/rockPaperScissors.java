package noCannotFindSymbolsHere;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args){
        Random randomNo = new Random();
        Scanner inputBox = new Scanner(System.in);
        System.out.println("Enter rock, paper or scissors ");
        String choice = inputBox.next();
        String[] choices = {"rock", "paper", "scissors"};
        int randIndex = randomNo.nextInt(1,3);
        if(randIndex==1){
            if(choice.equals("rock")){
                System.out.println("both entered rock, no result");
            }
            else if(choice.equals("paper")){
                System.out.println("you entered paper, computer entered rock. You win!");
            }
            else if(choice.equals("scissors")){
                System.out.println("Might wanna think about getting a new pair of scissors");
            }
            else{
                System.out.println("That's not a thing");
            }
        }
        else if(randIndex==2){
            if(choice.equals("rock")){
                System.out.println("that's one nicely wrapped rock you have there");
            }
            else if(choice.equals("paper")) {
                System.out.println("both entered paper and the papers refused to fight");
            }
            else if(choice.equals("scissors")){
                System.out.println("chop goes the paper! You win!");
            }
            else{
                System.out.println("Also not a thing");
            }
        }
        else if(randIndex==3){
            if(choice.equals("rock")){
                System.out.println("you didn't have to wreck the scissors but you win!");
            }
            else if(choice.equals("paper")) {
                System.out.println("what do you call your paper (which just went up against scissors)? shredded.");
            }
            else if(choice.equals("scissors")){
                System.out.println("the scissors refused to fight");
            }
            else{
                System.out.println("Also not a thing");
            }
        }
    }

}

