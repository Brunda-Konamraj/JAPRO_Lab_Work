/* Write a java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing the car" */

class VehicleTest {
    void drive() {
        System.out.println("Driving the vehicle");
    }
}

class Car extends VehicleTest {
    @Override
    void drive() {
        System.out.println("Repairing the car");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        VehicleTest vehicle = new VehicleTest();
        vehicle.drive();

        Car car = new Car();
        car.drive();
    }
}
