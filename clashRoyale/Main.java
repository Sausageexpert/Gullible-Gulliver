package clashRoyale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        card dartGoblin = new card();
        dartGoblin.damage=40;
        dartGoblin.name="dart goblin";
        dartGoblin.health=100;

        card minion = new card();
        minion.damage=30;
        minion.name="minion";
        minion.health=80;

        System.out.println("minion's health is initially: " + minion.health);
        minion.inflictedDamage(dartGoblin.damage);
        System.out.println("minion's health is now: "+minion.health);
        System.out.println("since it took damage from " + dartGoblin.name);
    }
}
