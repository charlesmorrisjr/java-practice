import java.time.Year;
import java.util.Objects;

public class Car {
  private final int year;
  private final String make;
  private final String model;

  // Use current year as default
  private static final int CURRENT_YEAR = Year.now().getValue();

  // Chained to master constructor
  public Car(String make, String model) {
    this(CURRENT_YEAR, make, model);
  }

  // Main constructor
  public Car(int year, String make, String model) {
    // Validate year
    if (year < 1886) {
      throw new IllegalArgumentException("Year cannot be before the invention of the car.");
    }

    this.year = year;
    this.make = Objects.requireNonNull(make, "Make cannot be null.");
    this.model = Objects.requireNonNull(model, "Model cannot be null.");
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
