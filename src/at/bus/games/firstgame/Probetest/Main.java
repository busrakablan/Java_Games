package at.bus.games.firstgame.Probetest;

public class Main {
    public static void main(String[] args) {

        CarDealer dealer = new CarDealer();
        Car car = new Car("BMW", 1);
        Train train = new Train("ÖBB", 1);
        AeroCar aeroCar = new AeroCar("nijo", 2);
        dealer.addVehicle(car);
        dealer.addVehicle(train);
        dealer.addVehicle(aeroCar);


        car.drive();
        train.drive();
        aeroCar.fly();

        dealer.printAllVehicles();

    }
}
