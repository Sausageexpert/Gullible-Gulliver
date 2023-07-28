package noCannotFindSymbolsHere;
import java.util.Scanner;

public class noStrangersHere {
    public static void main(String[] args){
       Scanner inputBox = new Scanner(System.in);
       String[] names = {"dog", "cat", "panda", "tortoise", "octopus", "baby angel"}; // an array
       String[] stickers = { "🐶", "🐱", "🐼", "🐢", "🐙","👼"};
       for(int i=0; i<names.length; i++) {
           System.out.println("The sticker corresponding to "+names[i]+" is "+ stickers[i]);
       }
       int[] ints = {1,2,3,4};
       for(int j=((ints.length)-1); j>=0; j-=1){ // 'let' is for javascript, java's friend-nemesis-baby-sibling-family-whatever (it's a complicated relationship)
           System.out.println(ints[j]);
       }
       String[] foods = {"chang kee puffs", "chorizo", "bratwurst", "italian", "Boursin cheese"};
       int[] available = {1, 4, 3, 2, 2};
       for(int k=0; k<foods.length; k++){
           System.out.println("The number of items " + foods[k] + " available is " + available[k]);
       }
       double[] foo = new double[4]; // specify how many elements you want beforehand, all of them are 0.0 by default
      // foo[1]=5.00;
       System.out.println(foo[1]);
    }
}

/*
{ "🐶", "🐱", "🐼", "🐢", "🐙","👼"};
*/