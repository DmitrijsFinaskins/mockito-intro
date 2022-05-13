import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CarTest {

    @Test
    void createCar(){

        Car car = new Car("",  "", 2014, "");
        Car newCar = Mockito.mock(Car.class);
        assertEquals(0, newCar.getYear());
    }

    @Test
    void remoteServissReturnValue(){
        Car newCar = Mockito.mock(Car.class);
        when(newCar.testInt(4)).thenReturn(10);
        assertEquals(10, newCar.testInt(4));
    }

    @Test
    void getOwner(){
        Car newCar = Mockito.mock(Car.class);
        when(newCar.getOwner()).thenReturn("Dmitrij");
        assertEquals("Dmitrij", newCar.getOwner());
    }

    @Test
    void verificationTest(){
        Car newCar = Mockito.mock(Car.class);
        assertEquals(null, newCar.getOwner());
        verify(newCar).getOwner();
    }
}
