class Vehicle {
    String make;
    int speed;

    void move() {
        System.out.println(make + " is moving at " + speed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryLevel;

    void chargeBattery() {
        batteryLevel = 100;
        System.out.println(make + " battery fully charged.");
    }

    void showBattery() {
        System.out.println("Battery: " + batteryLevel + "%");
    }
}

class AutonomousVehicle extends ElectricVehicle {
    boolean autopilotEnabled;

    void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot ON for " + make);
    }
}

public class Main4 {
    public static void main(String[] args) {
        AutonomousVehicle av = new AutonomousVehicle();

        av.make = "Tesla";
        av.speed = 120;
        av.batteryLevel = 45;

        av.move();
        av.showBattery();
        av.chargeBattery();
        av.enableAutopilot();
    }
}