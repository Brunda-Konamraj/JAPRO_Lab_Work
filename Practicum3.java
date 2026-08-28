// Abstract Class
abstract class Vehicle {
    protected String vehicleNumber;
    protected String brand;

    // Constructor to initialize attributes
    public Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    // Abstract method to be overridden by subclasses
    public abstract void startEngine();

    // Final method that cannot be overridden by subclasses
    public final void showVehicleIdentity() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }
}

// Subclass: Car
class Car extends Vehicle {
    public Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started using key ignition / push button.");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started using kick start / self-start.");
    }
}

// Main Class
public class Practicum3 {
    public static void main(String[] args) {
        // Test Case 1 & 5: Car creation and execution
        System.out.println("=== Car Details ===");
        Car car = new Car("KA01AB1234", "Toyota");
        car.showVehicleIdentity();
        car.startEngine();

        System.out.println("\n=== Bike Details ===");
        // Test Case 2: Bike creation and execution
        Bike bike = new Bike("KA05XY5678", "Honda");
        bike.showVehicleIdentity();
        bike.startEngine();
    }
}