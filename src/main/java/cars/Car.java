package cars;

import behaviours.IEngineOutput;

public class Car extends Vehicle implements IEngineOutput {


    public Car(double price, String colour, int numberOfDoors) {
        super(price, colour, numberOfDoors);
    }

    @Override
    public String getEngineOutput() {
        return "Vrrooom!";
    }
}
