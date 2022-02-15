package customer;

import cars.Vehicle;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void buyVehicle(Vehicle vehicle){
        if (this.money >= vehicle.getPrice()) {
            this.money -= vehicle.getPrice();
            this.ownedVehicles.add(vehicle);
        }
    }
}
