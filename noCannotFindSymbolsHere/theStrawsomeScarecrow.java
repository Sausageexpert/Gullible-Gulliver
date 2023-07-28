package noCannotFindSymbolsHere;

public class theStrawsomeScarecrow {
    public static void main(String[] args){
        foo(2, 2.4, "NotAString");
    }
    public static void foo(int a, double b, String c){
        System.out.println("a+b+c is "+a+b+c);
    }
    public static int bar(){
        return 49;
    }
}
