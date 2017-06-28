package car_management;
import behaviours.*;

public class DodgemCar implements Driveable {

  private int averageSpeed;
  private int numberOfSeats;

  public DodgemCar(int averageSpeed, int numberOfSeats) {
    this.averageSpeed = averageSpeed;
    this.numberOfSeats = numberOfSeats;
  }

  public int getSpeed() {
    return this.averageSpeed;
  }

  public int getSeats() {
    return this.numberOfSeats;
  }

  // public int driveDistance(int distance) {
  //   return null; //time it requires to drive a distance
  // }
}