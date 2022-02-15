package cars;

import components.Brakes;
import components.Engine;
import components.Tyre;


public abstract class Vehicle {

    private double price;
    private String colour;
    private int numberOfDoors;
    private Engine engine;
    private Brakes brakes;
    private Tyre tyre;

    public Vehicle(double price, String colour, int numberOfDoors, Engine engine, Brakes brakes, Tyre tyre) {
        this.price = price;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
        this.brakes = brakes;
        this.tyre = tyre;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Engine getEngine() {
        return engine;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
