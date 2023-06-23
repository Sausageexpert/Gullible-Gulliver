
public class Main { // same as the file name
    public static void main(String[] args) { // void means the main program doesn't return a value, printed lines aren't values
        System.out.println("Hello World!"); // adds an escape sequence to go to the next line at the end
        System.out.print("Hello Again!"); // stays on the same line
        System.out.print("I don't think you want to hear hellos any more times but HELLO!"); // stays on the same line
        System.out.print("I had coffee so I'm just going to keep saying hello till the caffeine wears out");
        System.out.println("Does this come on a new line?");

        int startingSalary = 1000000;
        String job = "making toothbrushes for bears and also dining tables for cockroaches on the side";
        float toothbrushCost = 100.01F; // paise
        double toothpasteCost = 1.01D; // paise, not including shipping
        double tableSize = 1.015687312; // in millimeters, cockroaches are EXTREMELY picky about their table sizes
        long customerSatisfactionRating = 922337203; // out of 10
        boolean doBearsUseToothbrushes = true; // because of course they do
        byte employeeCount = 1; // a single-handed corporate giant
        short employeeWorkplaceRating = 100; // I am satisfied with myself :)
    }
}

// hello
// public is something like global variable but it's called an access modifier,
// specifying the visibility of this method. Public means the method can be accessed anywhere in the program
// static means it belongs to the main class and not an instance of the class, the method can be called without creating an object
// that's something like function draw in studio.code

