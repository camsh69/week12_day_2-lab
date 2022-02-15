import cars.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car(25000.00, "Purple", 4);
    }

    @Test
    public void hasPrice() {
        assertEquals(25000.00, car.getPrice(), 0.0);
    }

    @Test
    public void hasColour() {
        assertEquals("Purple", car.getColour());
    }
}
