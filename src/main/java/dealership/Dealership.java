package dealership;

import cars.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> newCars;
    private double till;

    public Dealership(double till) {
        this.newCars = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getNewCars() {
        return newCars;
    }

    public double getTill() {
        return till;
    }

    public void add_money(double money)
}
