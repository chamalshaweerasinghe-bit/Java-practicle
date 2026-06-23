class NetworkDevice {
    String ipAddress;
    String macAddress;

    void connect() {
        System.out.println("Connecting device with IP: " + ipAddress);
    }

    void disconnect() {
        System.out.println("Device " + ipAddress + " disconnected");
    }
}

class Firewall extends NetworkDevice {
    String firewallName;

    void blockTraffic(String source) {
        System.out.println(firewallName + " blocked traffic from " + source);
    }

    void allowTraffic(String source) {
        System.out.println(firewallName + " allowed traffic from " + source);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Firewall fw = new Firewall();

        fw.ipAddress = "192.168.1.1";
        fw.macAddress = "AA:BB:CC:DD:EE:FF";
        fw.firewallName = "PFSense";

        fw.connect();
        fw.blockTraffic("10.0.0.5");
        fw.allowTraffic("10.0.0.9");
        fw.disconnect();
    }
}