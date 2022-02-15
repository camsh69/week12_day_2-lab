import cars.Car;
import components.Brakes;
import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarTest {

    Car car;
    Engine engine;
    Tyre tyre;
    Brakes brakes;

    @Before
    public void before() {
        engine = new Engine(85, "Petrol", 1500);
        tyre = new Tyre("Sports", 40);
        brakes = new Brakes(15);
        car = new Car(25000.00, "Purple", 4, engine, brakes, tyre);
    }

    @Test
    public void hasPrice() {
        assertEquals(25000.00, car.getPrice(), 0.0);
    }

    @Test
    public void hasColour() {
        assertEquals("Purple", car.getColour());
    }

    @Test
    public void hasEngineOutput() {
        assertEquals("Vrrooom!", car.getEngineOutput());
    }

    @Test
    public void hasEngine() {
        assertNotNull(car.getEngine());
    }
}
