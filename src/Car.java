/**
 * Concrete subclass representing a Car.
 */

class Car extends Vehicle {
    final int numDoors;

    /**
     * Constructs a car with the specified model and number of doors.
     *
     * @param model    The model of the car.
     * @param numDoors The number of doors of the car.
     */

    Car(String model, int numDoors) {
        super(model);
        this.numDoors = numDoors;
    }

    /**
     * Describes the car.
     *
     * @return Description of the car.
     */

    @Override
    public String describe() {
        return "A car with " + numDoors + " doors";
    }
}