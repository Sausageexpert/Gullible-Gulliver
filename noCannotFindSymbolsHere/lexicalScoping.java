package noCannotFindSymbolsHere;
import java.util.Scanner;

public class lexicalScoping {
    public static void main(String[] args){
        int thisIsAnInteger = 10;
       /* if (true){
            thisIsAnInteger = 20;
            int notAnInteger = 15; // just the same way NotALynx is not a lynx
        } */
       // notAnInteger = 20; // be warned, this will cause java to spill some coffee... probably on you

        Scanner inputBox = new Scanner(System.in);
        System.out.println("Enter the type of sausage by aptly describing the sound it makes when eaten ");
        String sausage = inputBox.next();
        switch(sausage){
                case "LunchCrunch": // there is no gap between lunching and crunching, hence there should be no gap between lunch and crunch
                    System.out.println("Enjoy your bratwurst lunch ");
                    break;
                case "MunchCrunch":
                    System.out.println("Enjoy your chorizo munch ");
                    break;
                case "BrunchCrunch":
                    System.out.println("Really any sausage is a brunch crunch");
                default:
                    System.out.println("Any time of the day is sausage time ");
                    break;
        }
        System.out.println("Number of buckets of sand available (please enter 5) ");
        int sandBuckets = inputBox.nextInt();
        for(int i=1; i<=sandBuckets; i++){
            System.out.println("Oh look, there's a sandcastle! ");
            System.out.println("We have created "+i+" sandcastles!");
            System.out.println("There is a honey-glazed sausage inside the sandcastle for Gullible (he's very gullible because he thinks I put a honey-glazed sausage in there and did not eat it)");
        }
        System.out.println("Enter the number of hurdles");
        int hurdles = inputBox.nextInt();
        int jumped = hurdles;
        if(hurdles<=5){
            System.out.println("Thank you for entering an appropriate number of hurdles");
            do{
                System.out.println("We have jumped through "+ (hurdles-jumped+1)+ " hurdles");
                jumped-=1;
            } while(jumped>0); // does first, checks the condition after

        }
        else{
            System.out.println("NotALynx refuses to tire himself out by jumping through as many hurdles as you want him to, he is not a trained dolphin");
            System.out.println("Gullible will now proceed to eat a few hurdles, until there are only 5 left (we tried to stop him)");
        }
    }
}

/*
Please get your visa, Ms. Squiggly Underline
We really, really want you here, but you need your visa
(don't give her a visa)

I shall now type with utmost formality so as to not offend your finer tastes, Intellij
 */
