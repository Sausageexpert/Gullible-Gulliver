package clashRoyale;

public class card {
    int damage;
    String name;
    int health;
    void inflictedDamage(int amount){
        health-=amount;
    }
}
