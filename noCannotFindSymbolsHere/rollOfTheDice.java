package noCannotFindSymbolsHere;
import java.util.Random;

public class rollOfTheDice {
    public static void main(String[] args){
        System.out.println("The (completely unbiased) dice has been rolled and the result is... (cue the drumroll) ");
        System.out.println(roll());
    }
    public static int roll(){
        Random rand = new Random();
        int number = rand.nextInt(6);
        return number;
    }
}
