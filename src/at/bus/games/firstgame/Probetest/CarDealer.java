package at.bus.games.firstgame.Probetest;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Vehicle>vehicles = new ArrayList<Vehicle>();

    void addVehicle(Vehicle vehicle){
       vehicles.add(vehicle);
    }

    void printAllVehicles(){
        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.getID() + ":" + vehicle.getName());
        }
    }
}