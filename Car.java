public class Car {
  private int year;
  private String make;
  private String model;

  // Two-parameter constructor
  public Car(String make, String model) {
    this.year = 2026;
    this.make = make;
    this.model = model;
  }

  // Three-parameter constructor
  public Car(int year, String make, String model) {
    this.year = year;
    this.make = make;
    this.model = model;
  }

  // Print car's year, make, and model
  public void printInfo() {
    System.out.println(this.year + " " + this.make + " " + this.model);
  }

  public static void main(String args[]) {
    Car car1 = new Car("Ford", "Mustang");
    Car car2 = new Car(2020, "Chevrolet", "Corvette");

    car1.printInfo();
    car2.printInfo();
  }
}
