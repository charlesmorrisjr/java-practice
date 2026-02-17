import java.time.Year;

public class Car {
  private final int year;
  private final String make;
  private final String model;

  // Use current year as default
  private static final int MIN_YEAR = 1886;

  // Chained to master constructor
  public Car(String make, String model) {
    this(Year.now().getValue(), make, model);
  }

  // Main constructor
  public Car(int year, String make, String model) {
    // Validate year
    if (year < MIN_YEAR) {
      throw new IllegalArgumentException("Year cannot be before the invention of the car.");
    }

    this.year = year;
    this.make = validate(make, "Make");
    this.model = validate(model, "Model");
  }

  // Validate make and model arguments
  private String validate(String value, String fieldName) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException(fieldName + " cannot be null or blank.");
    }
    return value.trim();
  }

  public int getYear() {
    return this.year;
  }

  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  // Override toString and return year, make, and model
  @Override
  public String toString() {
    return String.format("%d %s %s", this.year, this.make, this.model);
  }

  public static void main(String[] args) {
    Car car1 = new Car("Ford", "Mustang");
    Car car2 = new Car(2020, "Chevrolet", "Corvette");

    System.out.println(car1);
    System.out.println(car2);
  }
}
