import static org.junit.Assert.*;
import org.junit.*;
import car_management.*;

public class DriverTest {

  Driver driver;
  DodgemCar dodgemcar;

  @Before
  public void before() {
    dodgemcar = new DodgemCar(10, 2);
    driver = new Driver("Tony", dodgemcar);
  }

  @Test
  public void hasName() {
    assertEquals("Tony", driver.getName());
  }
  
  @Test
  public void hasQuadBike() {
    QuadBike quadbike = new QuadBike(40, 250);
    driver = new Driver("Tony", quadbike);
    assertEquals(40, quadbike.getSpeed());
  }

  @Test
  public void canDriveDistance() {
    driver = new Driver("Tony", dodgemcar);
    assertEquals(4, driver.driveDistance(40));
  }

  @Test
  public void canSetVehicle() {
    DodgemCar dodgemcar = new DodgemCar(10, 2);
    driver.setVehicle(dodgemcar);
    assertEquals(4, driver.driveDistance(40));
  }

}  