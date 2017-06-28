package car_management;
import behaviours.*;

public class QuadBike implements Drivable {

  private int averageSpeed;
  private int engineCapacity;

  public QuadBike(int averageSpeed, int engineCapacity);
    this.averageSpeed = averageSpeed;
    this.engineCapacity = engineCapacity;
}