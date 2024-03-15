/**
 * Main class for testing the hierarchy.
 */

public class Main {
    public static void main(String[] args) {
        Car sedan = new Car("Sedan", 4);
        System.out.println(sedan.describe());

        Motorcycle bike = new Motorcycle("Sport Bike", false);
        System.out.println(bike.describe());

        Truck deliveryTruck = new Truck("Delivery Truck", 30.5);
        System.out.println(deliveryTruck.describe());
    }
    }
