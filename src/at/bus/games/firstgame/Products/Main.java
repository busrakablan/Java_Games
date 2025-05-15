package at.bus.games.firstgame.Products;

import at.bus.games.firstgame.Probetest.Car;

public class Main {
    public static void main(String[] args) {

        GUI gui = new GUI1();
        gui.addProduct(new Shoe(2,"Blue"));
        gui.addProduct(new Phone(3,"Apple"));
        gui.start();
    }

}
