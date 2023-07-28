package noCannotFindSymbolsHere;
import java.util.Random;

public class fortuneTellingSphere {
    public static void main(String[] args){
        System.out.println("Welcome to the magic sphere, which is definitely going to give you accurate advice");
        System.out.println(giveAdvice());
    }
    public static String giveAdvice(){
        String[] replies = {"asking me for advice may not be the best decision", "You should probably buy another magic 8 ball and then juggle the both of us :D", "There's a very interesting video on youtube with the sound elk make, that'll help you make a decision"};
        Random adv = new Random();
        int index = adv.nextInt(replies.length);
        return replies[index];
    }
}
