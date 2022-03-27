import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void createCar(){

        Car car = new Car("",  "", 2014, "");
        Car newCar = Mockito.mock(Car.class);
        assertEquals(0, newCar.getYear());
    }
}
