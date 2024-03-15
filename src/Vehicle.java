/**
 * Abstract class representing a Vehicle.
 */

abstract class Vehicle implements Transportation {
    final String model;

    /**
     * Constructs a vehicle with the specified model.
     *
     * @param model The model of the vehicle.
     */

    Vehicle(String model) {
        this.model = model;
    }

    /**
     * Abstract method for describing the vehicle.
     *
     * @return Description of the vehicle.
     */

    @Override
    public abstract String describe();

    /**
     * Returns a string representation of the vehicle.
     *
     * @return String representation of the vehicle.
     */

    @Override
    public String toString() {
        return "Vehicle: " + model;
    }
}