package noCannotFindSymbolsHere;
import java.util.Scanner;

/*
The if is nested
just like the moth in my hair, I fear

The lynx will only have coffee
if the sun is shining
 */

public class nestedIf {
    public static void main(String[] args){
        Scanner inputBox = new Scanner(System.in);
        System.out.println("Kindly inform me of the prevailing weather noCannotFindSymbolsHere.conditions (it can only be rainy or sunny, other climatic noCannotFindSymbolsHere.conditions are simply myths) ");
        String weather = inputBox.next();
        if (weather=="sunny"){
            if (weather=="rainy"){
                System.out.println("NotALynx\'s schedule is really jam packed today (he plans to watch raindrops race on his window and it is very occupying ");
            }
            else{
                System.out.println("If you're ok having a hyper lynx to deal with, NotALynx will most gladly accompany you to the coffee house");
            }
        }
        else{
            System.out.println("NotALynx\'s schedule is really jam packed today (he plans to watch raindrops race on his window and it is very occupying");
        }
    }
}
