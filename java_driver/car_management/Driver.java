package car_management;
import behaviours.*;

public class Driver {

  private String name;
  private Driveable ride;

 public Driver(String name, Driveable ride) {
   this.name = name;
   this.ride = ride;
  }
}