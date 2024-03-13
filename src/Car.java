class Car extends Vehicle {
    final int numDoors;

    Car(String model, int numDoors) {
        super(model);
        this.numDoors = numDoors;
    }

    @Override
    String getDescription() {
        return "A car with " + numDoors + " doors";
    }
}