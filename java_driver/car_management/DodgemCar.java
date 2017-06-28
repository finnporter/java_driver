package car_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  // private int averageSpeed;
  private int numberOfSeats;

  public DodgemCar(int averageSpeed, int numberOfSeats) {
    super(averageSpeed);
    this.numberOfSeats = numberOfSeats;
  }

  // public int getSpeed() {
  //   return this.averageSpeed;
  // }

  public int getSeats() {
    return this.numberOfSeats;
  }

  public int driveDistance(int distance) {
    return distance / this.averageSpeed;
  }
}



//t = distance / speed