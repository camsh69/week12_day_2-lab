import cars.Car;
import cars.ElectricCar;
import components.Brakes;
import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyre tyre;
    Brakes brakes;

    @Before
    public void before() {
        engine = new Engine(85, "Electric", 1500);
        tyre = new Tyre("Sports", 40);
        brakes = new Brakes(15);
        electricCar = new ElectricCar(25000.00, "Indigo", 4, engine, brakes, tyre);
    }

    @Test
    public void hasEngineOutput() {
        assertEquals("purrrr!", electricCar.getEngineOutput());
    }
}
