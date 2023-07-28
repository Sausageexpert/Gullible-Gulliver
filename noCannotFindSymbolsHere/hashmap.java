package noCannotFindSymbolsHere;
import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args){
        Scanner inputBox = new Scanner(System.in);
        System.out.println("Enter the animal intently staring at the hash browns ");
        String animal = inputBox.nextLine(); // using next might think the dot for abbreviations is the end of the line
        String requiredSound = getAnimalSound(animal);
        System.out.println("The animal about to steal your hash browns is " + animal + " and the sound of victory you will hear as it munch crunches on your breakfast will be " + requiredSound);
    }
    public static String getAnimalSound(String animal){
        HashMap<String, String> sounds = new HashMap<>(); // both key and value are strings, initialises an empty HashMap
        sounds.put("pig", "oink oink");
        sounds.put("cat", "meow");
        sounds.put("dog", "bow wowoof"); // it's a very confused dog
        sounds.put("lynx", "yeAeEeEEEEwWwWeEeAaAaaaaAAAAAEWyy"); // it's a very hungry lynx
        sounds.put("elk", "oOooaaaEeeeEaAAooooOoOoOooooaaaAaAaaaaEEEeEeeeoOOOOOO");
        return sounds.getOrDefault(animal.toLowerCase(), "unknown");
    }
}
