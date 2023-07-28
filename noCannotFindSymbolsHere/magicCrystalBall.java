package noCannotFindSymbolsHere;
import java.util.Scanner;

public class magicCrystalBall {
    public static void main(String[] args){
        String[] future = {"taster in super sausages (the best option here)", "rocket scientist (to deliver sausages to the moon)", "engineer (to make yummy sausages even vegetarians can eat)", "mathematician (to calculate mass, density, volume and profit)"};
        Scanner inputBox = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = inputBox.next();
        System.out.println("Enter any number ever");
        int choice = inputBox.nextInt();
        choice=choice%4;
        System.out.println("The non-computerised magical crystal ball has spoken... your destiny, " + name + " is that of a/an " + future[choice]);
    }
}
