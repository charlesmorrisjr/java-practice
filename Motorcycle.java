class Vehicle {
    protected String make = "Yamaha";

    public void honk() {
        System.out.println("Honk!");
    }
}

class Motorcycle extends Vehicle {
    private String model = "R1";

    @Override
    public String toString() {
        return "%s %s".formatted(make, model);
    }

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        System.out.println(motorcycle);
    }
}
