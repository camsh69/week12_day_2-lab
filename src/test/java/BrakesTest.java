import components.Brakes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrakesTest {

    Brakes brakes;

    @Before
    public void before() {
        brakes = new Brakes(15);
    }

    @Test
    public void hasPadSize() {
        assertEquals(15, brakes.getPadSize());
    }
}
