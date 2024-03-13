abstract class Vehicle {
    final String model;

    Vehicle(String model) {
        this.model = model;
    }

    abstract String getDescription();

    @Override
    public String toString() {
        return "Vehicle: " + model;
    }
}