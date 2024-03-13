public class Main {
    public static void main(String[] args) {
            Car sedan = new Car("Sedan", 4);
            System.out.println(sedan.getDescription());

            Motorcycle bike = new Motorcycle("Sport Bike", false);
            System.out.println(bike.getDescription());

            Truck deliveryTruck = new Truck("Delivery Truck", 30.5);
            System.out.println(deliveryTruck.getDescription(true));
        }
    }
