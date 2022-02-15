package cars;

import behaviours.IEngineOutput;
import components.Brakes;
import components.Engine;
import components.Tyre;

public class Car extends Vehicle implements IEngineOutput {


    public Car(double price, String colour, int numberOfDoors, Engine engine, Brakes brakes, Tyre tyre) {
        super(price, colour, numberOfDoors, engine, brakes, tyre);
    }

    @Override
    public String getEngineOutput() {
        return "Vrrooom!";
    }
}
