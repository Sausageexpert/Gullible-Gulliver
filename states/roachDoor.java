package states;

public class roachDoor {
    int no;
    String name;
    boolean isOpen;

    void close(){
        isOpen=false;
    }
    void open(){
        isOpen=true;
    }
    void printStatus(){
        if(isOpen){
            System.out.println(name+" door is open (mr. roachie has not yet plonked himself on the seat)");
        }
        else{
            System.out.println(name+" door is closed (mr. roachie has plonked himself on the seat)");
        }
    }
}

// default of a boolean is false
