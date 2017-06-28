package car_management;
import behaviours.*;

public class QuadBike implements Driveable {

  private int averageSpeed;
  private int engineCapacity;

  public QuadBike(int averageSpeed, int engineCapacity) {
    this.averageSpeed = averageSpeed;
    this.engineCapacity = engineCapacity;
  }

  public int getSpeed() {
    return this.averageSpeed;
  }

  public int getEngineCapacity() {
    return this.engineCapacity;
  }

    public int driveDistance(int distance) {
      return distance / this.averageSpeed;
    }



}
  
  //t = distance / speed