import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre("Sports", 40);
    }

    @Test
    public void hasTyreType() {
        assertEquals("Sports", tyre.getTyreType());
    }

    @Test
    public void hasRadius() {
        assertEquals(40, tyre.getRadius());
    }
}
