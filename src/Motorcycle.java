/**
 * Concrete subclass representing a Motorcycle.
 */
class Motorcycle extends Vehicle {
    final boolean hasSidecar;

    /**
     * Constructs a motorcycle with the specified model and sidecar information.
     *
     * @param model      The model of the motorcycle.
     * @param hasSidecar Whether the motorcycle has a sidecar.
     */

    Motorcycle(String model, boolean hasSidecar) {
        super(model);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Describes the motorcycle.
     *
     * @return Description of the motorcycle.
     */

    @Override
    public String describe() {
        return hasSidecar ? "A motorcycle with a sidecar" : "A regular motorcycle";
    }
}