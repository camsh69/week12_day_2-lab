package cars;

public abstract class Vehicle {

    private double price;
    private String colour;
    private int numberOfDoors;

    public Vehicle(double price, String colour, int numberOfDoors) {
        this.price = price;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
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
}
