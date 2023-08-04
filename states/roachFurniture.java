package states;

public class roachFurniture {
    String colour;
    String material;
    boolean hasArmrests;
    int minHeight;
    int maxHeight;
    double currentHeight;
    boolean hasWheels;
    double weight;
    String modelNo;

    void raise(){
        currentHeight++;
    }
    void lower(){
        currentHeight--;
    }
    void swivelLeft(){
        // rotate left
    }
    void swivelRight(){
        // rotate right
    }
}

// the variables are states, functions are behaviours. Behaviours may alter states

