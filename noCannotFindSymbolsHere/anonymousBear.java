package noCannotFindSymbolsHere;

import java.util.Scanner;

public class anonymousBear {
    public static void main(String[] args) {
       Scanner inputBox = new Scanner(System.in);
        System.out.println("enter first name: ");
        String fullName = inputBox.nextLine(); // whatever the user enters next will be taken as the first name if you use next, entering multiple words only takes the first one. Using nextline fixes that problem
        System.out.println("your name is "+fullName);
        System.out.println("enter age: ");
        int age = inputBox.nextInt();
        System.out.print("your age is "+age);
        System.out.println("Enter money: ");
        double pocketMoney = inputBox.nextDouble();
        System.out.print("to all stakeholders, we have made "+pocketMoney+" amount of interest");
        System.out.println("Enter your height in metres: ");
        double userHeight = inputBox.nextDouble();
        System.out.println("Your height is"+userHeight);
        double averageMaleHeightDiff = userHeight-1.75;
        double averageFemaleHeightDiff = userHeight-1.62;
        /* System.out.println("The difference between your height and the average male height is "+averageMaleHeightDiff);
        System.out.println("The difference between your height and the average female height is "+averageFemaleHeightDiff); */
        System.out.format("%.2fm male height difference: \n",+averageMaleHeightDiff); // rounds off to two decimal places, f means float, use i for int and s for string
        System.out.format("%.2fm female height difference: \n",+averageFemaleHeightDiff);
    }
}
