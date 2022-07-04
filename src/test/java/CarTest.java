import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions.*;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CarTest {

    @Mock
    Car newCar;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void createCar(){

        Car car = new Car("",  "", 2014, "");
        Car newCar = Mockito.mock(Car.class);
        assertEquals(0, newCar.getYear());
    }

    @Test
    void remoteServissReturnValue(){
        when(newCar.testInt(4)).thenReturn(10);
        assertEquals(10, newCar.testInt(4));
    }

    @Test
    void getOwner(){
        when(newCar.getOwner()).thenReturn("Dmitrij");
        assertEquals("Dmitrij", newCar.getOwner());
    }

    @Test
    void verificationTest(){
        assertEquals(null, newCar.getOwner());
        verify(newCar, only()).getOwner();
    }
}
