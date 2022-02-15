import cars.ElectricCar;
import cars.HybridCar;
import components.Brakes;
import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Tyre tyre;
    Brakes brakes;

    @Before
    public void before() {
        engine = new Engine(85, "Electric", 1500);
        tyre = new Tyre("Sports", 40);
        brakes = new Brakes(15);
        hybridCar = new HybridCar(25000.00, "Cobalt", 4, engine, brakes, tyre);
    }

    @Test
    public void hasEngineOutput() {
        assertEquals("vrmpurrrr!", hybridCar.getEngineOutput());
    }
}

