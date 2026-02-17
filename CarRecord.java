import java.time.Year;

public record CarRecord(int year, String make, String model) {
    public CarRecord {
        if (year < 1886)
            throw new IllegalArgumentException("Invalid year");
        if (make == null || make.isBlank())
            throw new IllegalArgumentException("Make required");
        if (model == null || model.isBlank())
            throw new IllegalArgumentException("Model required");
    }

    public CarRecord(String make, String model) {
        this(Year.now().getValue(), make, model);
    }

    @Override
    public String toString() {
        return "%d %s %s".formatted(year, make, model);
    }

    public static void main(String[] args) {
        CarRecord car = new CarRecord(2000, "Ford", "Mustang");

        System.out.println(car);
    }
}
