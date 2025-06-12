package at.bus.games.firstgame.Praxistest;

import at.bus.games.firstgame.Probetest.AeroCar;
import at.bus.games.firstgame.Probetest.Car;
import at.bus.games.firstgame.Probetest.CarDealer;
import at.bus.games.firstgame.Probetest.Train;
import at.bus.games.firstgame.Products.GUI1;
import at.bus.games.firstgame.Products.Shoe;


public class Main {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();
        Audiobooks AB = new Audiobooks(1,"hallo",30,"cool");
        Romane R = new Romane(2,"Sonne",30,"ajdköj");
        manager.getAllMedia();



    }
}


