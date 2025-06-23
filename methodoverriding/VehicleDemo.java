package methodoverriding;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Demonstration of Vehicle Types:");

        Bike bike = new Bike("Royal Enfield", "Cruiser");
        bike.displayInfo();
        bike.start();
        bike.stop();

        System.out.println();

        Car car = new Car("Mahindra", "SUV");
        car.displayInfo();
        car.start();
        car.stop();
    }
}

// Parent class
class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void displayInfo() {
        System.out.println("Vehicle Brand: " + brand + ", Wheels: " + wheels);
    }

    void start() {
        System.out.println("Starting the vehicle: " + brand);
    }

    void stop() {
        System.out.println("Stopping the vehicle: " + brand);
    }
}

// Two-wheeler class
class TwoWheeler extends Vehicle {
    String type;

    TwoWheeler(String brand, String type) {
        super(brand, 2);
        this.type = type;
    }

    @Override
    void displayInfo() {
        System.out.println("Two-Wheeler Brand: " + brand + ", Type: " + type + ", Wheels: " + wheels);
    }
}

// Four-wheeler class
class FourWheeler extends Vehicle {
    String type;

    FourWheeler(String brand, String type) {
        super(brand, 4);
        this.type = type;
    }

    @Override
    void displayInfo() {
        System.out.println("Four-Wheeler Brand: " + brand + ", Type: " + type + ", Wheels: " + wheels);
    }
}

// Bike class
class Bike extends TwoWheeler {
    Bike(String brand, String type) {
        super(brand, type);
    }

    @Override
    void start() {
        System.out.println("Starting the bike");
    }

    @Override
    void stop() {
        System.out.println("Stopping the bike");
    }
}

// Car class
class Car extends FourWheeler {
    Car(String brand, String type) {
        super(brand, type);
    }

    @Override
    void start() {
        System.out.println("Starting the car");
    }

    @Override
    void stop() {
        System.out.println("Stopping the car");
    }
}

