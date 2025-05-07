package at.bus.games.firstgame.Probetest;

public class Car extends AbstractVehicle {

    public Car(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void drive() {
        System.out.println("The Car is driving");
    }
}
