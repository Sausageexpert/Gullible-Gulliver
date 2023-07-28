package noCannotFindSymbolsHere;
import java.util.Random;

public class jokesOverCoffee {
    public static void main(String[] args){
        String[] jokes = {"why don't scientists trust atoms? because they make up everything", "did you hear about the mathematician who's afraid of negative numbers? he'll stop at nothing to avoid them", "what's the best thing about switzerland? I don't know, but the flag is a big plus"};
        Random randNo = new Random();
        int randIndex = randNo.nextInt(0,2);
        System.out.println(jokes[randIndex]);
    }
}
