package noCannotFindSymbolsHere;

public class anotherSmolFile {
    public static void main(String[] args){
        System.out.println("Saying my best prayers (that this will work) ");
        System.out.format("I have %d lynxes", 2); // %d is like curly braces in python and using f before the quotes, %d is substituted with 2. Use %.2f for float
        System.out.format("I have %.3f cats, %d dogs and 1 %s which may or may not be illegal ", 2.5, 1, "panther"); // rounds to three decimal places since %.3f
        System.out.format("When formatted, : %.1f ", 4.5-2.7); // rounds to one decimal place
    }
}
