/**
 * Interface representing different types of transportation.
 */

interface Transportation {

    /**
     * Describes the transportation.
     *
     * @return Description of the transportation.
     */

    String describe();

    /**
     * Returns the maximum speed of the transportation.
     *
     * @return The maximum speed.
     */

    default int getMaxSpeed() {
        return 0;
    }

    /**
     * Returns the number of wheels of the transportation.
     *
     * @return The number of wheels.
     */

    static int getNumWheels() {
        return 0;
    }
}