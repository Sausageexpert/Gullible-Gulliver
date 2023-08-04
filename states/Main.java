package states;

public class Main {
    public static void main(String[] args){
        roachDoor passengerDoor = new roachDoor();
        passengerDoor.name="roachie";
        passengerDoor.no=1;
        passengerDoor.open();
        passengerDoor.printStatus();

        roachDoor driverDoor = new roachDoor();
        driverDoor.name="driver";
        driverDoor.no=2;
        driverDoor.open();
        driverDoor.printStatus();

        driverDoor.close();
        driverDoor.printStatus(); // all these functions change states
    }
}
