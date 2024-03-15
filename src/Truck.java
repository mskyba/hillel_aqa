/**
 * Concrete subclass representing a Truck.
 */

class Truck extends Vehicle {
    final double cargoCapacity;

    /**
     * Nested class representing a TruckEngine.
     */

    static class TruckEngine {
        private final String engineType;

        /**
         * Constructs a TruckEngine with the specified engine type.
         *
         * @param engineType The type of engine.
         */

        TruckEngine(String engineType) {
            this.engineType = engineType;
        }

        /**
         * Describes the truck engine.
         *
         * @return Description of the truck engine.
         */

        String describeEngine() {
            return "Engine type: " + engineType;
        }
    }

    /**
     * Constructs a truck with the specified model and cargo capacity.
     *
     * @param model         The model of the truck.
     * @param cargoCapacity The cargo capacity of the truck.
     */

    Truck(String model, double cargoCapacity) {
        super(model);
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Describes the truck.
     *
     * @return Description of the truck.
     */

    @Override
    public String describe() {
        return "A truck without cargo capacity information";
    }
}
