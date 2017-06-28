import static org.junit.Assert.*;
import org.junit.*;
import car_management.*;

public class QuadBikeTest {

  QuadBike quadbike;

  @Before
  public void before() {
    quadbike = new QuadBike(40, 250);
  }

  @Test
  public void hasSpeed() {
    assertEquals(40, quadbike.getSpeed());
  }

  @Test
  public void hasEngineCapacity() {
    assertEquals(250, quadbike.getEngineCapacity());
  }

  @Test
  public void canDriveDistance() {
    assertEquals(1, quadbike.driveDistance(40));
  }
}