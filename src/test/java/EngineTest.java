import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(85, "Petrol", 1500);
    }

    @Test
    public void hasHorsePower() {
        assertEquals(85, engine.getHorsePower());
    }

    @Test
    public void hasFuelType() {
        assertEquals("Petrol", engine.getFuelType());
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1500, engine.getEngineSize());
    }
}
