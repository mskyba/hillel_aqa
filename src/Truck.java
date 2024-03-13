public class Truck extends Vehicle {
    final double cargoCapacity;

    Truck(String model, double cargoCapacity) {
        super(model);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    String getDescription() {
        return "A truck without cargo capacity information";
    }

}