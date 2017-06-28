package car_management;

public abstract class Vehicle {

  int averageSpeed;

  public Vehicle(int averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public int getSpeed() {
    return this.averageSpeed;
  }
}