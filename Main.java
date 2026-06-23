class Device {
    String brand;
    String model;
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println(brand + " " + model + " is now ON.");
    }

    void turnOff() {
        isOn = false;
        System.out.println(brand + " " + model + " is now OFF.");
    }

    

    
}

class SmartDevice extends Device {
    String appName;

    void connectToApp() {
        System.out.println(brand + " connected to " + appName);
    }
}

public class Main {
    public static void main(String[] args) {
        SmartDevice SD = new SmartDevice();
        SD.brand = "Samsung";
        SD.model = "Galaxy S24";
        SD.appName = "SmartThings";

        SD.turnOn();
        SD.connectToApp();
        SD.turnOff();

    }
}
