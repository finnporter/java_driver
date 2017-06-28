import static org.junit.Assert.*;
import org.junit.*;
import car_management.*;

public class DodgemCarTest {

  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar(10, 2);
  }

  @Test
  public void hasSpeed() {
    assertEquals(10, dodgemCar.getSpeed());
  }
}