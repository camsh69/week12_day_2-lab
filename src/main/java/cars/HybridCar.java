package cars;

import components.Brakes;
import components.Engine;
import components.Tyre;

public class HybridCar extends Vehicle {

    public HybridCar(double price, String colour, int numberOfDoors, Engine engine, Brakes brakes, Tyre tyre) {
        super(price, colour, numberOfDoors, engine, brakes, tyre);
    }
}
