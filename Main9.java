class Vehicle {

    void startEngine() {
        System.out.println("Vehicle engine is starting.");
    }
}

class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key or button.");
    }
}

class Motorcycle extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a self-start or kick-start.");
    }
}

class Truck extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Truck engine starts with high-power ignition.");
    }
}

public class Main9 {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Truck()
        };

        
        for (Vehicle v : vehicles) {
            v.startEngine();
        }
    }
}