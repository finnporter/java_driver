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

  @Test
  public void hasSeats() {
    assertEquals(2, dodgemCar.getSeats());
  }

  @Test
  public void canDriveDistance() {
    assertEquals(1, dodgemCar.driveDistance(10));
  }
}