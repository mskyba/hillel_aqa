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

    String getDescription(boolean includeCargoCapacity) {
        if (includeCargoCapacity) {
            return "A truck with a cargo capacity of " + cargoCapacity + " cubic meters";
        } else {
            return getDescription();
        }
    }

}