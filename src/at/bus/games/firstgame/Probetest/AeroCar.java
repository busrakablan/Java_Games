package at.bus.games.firstgame.Probetest;

public class AeroCar extends Car {
    public AeroCar(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void drive() {
        System.out.println("Aerocar is driving");
    }

    public void fly(){
        System.out.println("Aerocar is flying");
    }
}
