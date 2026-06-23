// ================= QUESTION 1 =================

class NetworkDevice {
    String deviceId;
    String ipAddress;
    String deviceName;
    boolean isOnline;
    int threatLevel;

    // Parameterized Constructor
    NetworkDevice(String deviceId, String ipAddress, String deviceName,
                  boolean isOnline, int threatLevel) {
        this.deviceId = deviceId;
        this.ipAddress = ipAddress;
        this.deviceName = deviceName;
        this.isOnline = isOnline;
        this.threatLevel = threatLevel;
    }

    // Display device details
    void displayStatus() {
        System.out.println("Device ID      : " + deviceId);
        System.out.println("IP Address     : " + ipAddress);
        System.out.println("Device Name    : " + deviceName);
        System.out.println("Online Status  : " + isOnline);
        System.out.println("Threat Level   : " + threatLevel);
    }

    // Check if device is critical
    boolean isCritical() {
        if (threatLevel >= 7) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {

        // TEST FIRST
        System.out.println("=== TESTING NetworkDevice ===");

        NetworkDevice d1 = new NetworkDevice(
                "DEV101",
                "192.168.1.10",
                "Firewall",
                true,
                8
        );

        d1.displayStatus();

        System.out.println("Is Critical : " + d1.isCritical());
    }
}