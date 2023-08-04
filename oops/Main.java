package oops;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        products sausage = new products();
        sausage.desc = "munch lunch brunch crunches";
        sausage.price = 20;

        products milk = new products();
        milk.desc = "especially chocolate flavoured";
        milk.price = 15;

        products soap = new products();
        soap.desc = "soapy";
        soap.price = 10;

        soap.notAFoo();
        milk.notAFoo();
        sausage.notAFoo();
        int totalPrice = (sausage.price+milk.price+soap.price);
        System.out.println("Including taxes, we're back to our original price of " + totalPrice);

        superheroes roachie = new superheroes();
        roachie.superpower = "terrifying intimidation and ability to fly when you least expect him to";
        roachie.job_title = "salesman";
        roachie.name = "roachie";

        superheroes bear = new superheroes();
        bear.superpower = "has very shiny teeth (from all the milk he's been drinking)";
        bear.job_title = "advertisement manager";
        bear.name = "bear";

        superheroes OrthodoxCamel = new superheroes(); // variable holds a reference to the object, not the object
        OrthodoxCamel.superpower = "stuffing himself into tents (he does a lot of yoga)";
        OrthodoxCamel.job_title = "public relations manager";
        OrthodoxCamel.name = "OrthodoxCamel";

        System.out.println("Our employees are now "+OrthodoxCamel.name+" "+bear.name+" "+roachie.name);
    }
}
