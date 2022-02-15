import cars.Car;
import components.Brakes;
import components.Engine;
import components.Tyre;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;
    Tyre tyre;
    Brakes brakes;

    @Before
    public void before(){
        customer = new Customer(50000.00);
        engine = new Engine(85, "Petrol", 1500);
        tyre = new Tyre("Sports", 40);
        brakes = new Brakes(15);
        car = new Car(25000.00, "Purple", 4, engine, brakes, tyre);    }


    @Test
    public void hasMoney(){
        assertEquals(50000.00, customer.getMoney(), 0.0);
    }

    @Test
    public void ownedVehiclesStartsEmpty(){
        assertEquals(0, customer.getOwnedVehicles().size());
    }

    @Test
    public void canBuyVehicle(){
        customer.buyVehicle(car);
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals(25000.00, customer.getMoney(), 0.0);
    }

}
