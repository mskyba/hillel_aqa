class Motorcycle extends Vehicle {
    final boolean hasSidecar;

    Motorcycle(String model, boolean hasSidecar) {
        super(model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    String getDescription() {
        if (hasSidecar) {
            return "A motorcycle with a sidecar";
        } else {
            return "A regular motorcycle";
        }
    }
}
