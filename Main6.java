class SecurityAlert {

    String threatId;
    String source;
    String severity;

    void logAlert() {
        System.out.println("[ALERT] ID: " + threatId +
                " | Source: " + source +
                " | Severity: " + severity);
    }

    void logAlert(String extraInfo) {
        System.out.println("[ALERT] ID: " + threatId +
                " | Source: " + source +
                " | Severity: " + severity +
                " | Info: " + extraInfo);
    }

    void logAlert(String extraInfo, boolean sendEmail) {

        System.out.println("[ALERT] ID: " + threatId +
                " | Source: " + source +
                " | Severity: " + severity +
                " | Info: " + extraInfo);

        if (sendEmail) {
            System.out.println("Email notification sent for " + threatId);
        }
    }

    void raiseAlert() {
        System.out.println("!! SECURITY ALERT !! " +
                threatId + " from " + source);
    }
}

class MalwareAlert extends SecurityAlert {

    String malwareType;

    @Override
    void raiseAlert() {
        System.out.println("[MALWARE] " +
                malwareType +
                " detected from " +
                source + "!");
    }

    void quarantine() {
        System.out.println("Quarantining " +
                malwareType +
                " from " +
                source + "...");
    }
}

class PhishingAlert extends SecurityAlert {

    String targetEmail;

    @Override
    void raiseAlert() {
        System.out.println("[PHISHING] Attack targeting " +
                targetEmail +
                " from " +
                source + "!");
    }

    void blockEmail() {
        System.out.println("Blocking phishing email targeting: "
                + targetEmail);
    }
}

class DDoSAlert extends SecurityAlert {

    int packetCount;

    @Override
    void raiseAlert() {
        System.out.println("[DDoS] " +
                source +
                " - " +
                packetCount +
                " packets!");
    }

    void mitigate() {
        System.out.println("Mitigating DDoS from " +
                source +
                " - " +
                packetCount +
                " packets dropped");
    }
}

public class Main6 {

    public static void main(String[] args) {

      
        MalwareAlert m = new MalwareAlert();

        m.threatId = "ALT-001";
        m.source = "192.168.1.5";
        m.severity = "Critical";
        m.malwareType = "Ransomware";

        m.logAlert();
        m.logAlert("Encrypted 3 files");
        m.logAlert("Encrypted 3 files", true);
        m.raiseAlert();
        m.quarantine();

        System.out.println();



        SecurityAlert[] alerts = new SecurityAlert[3];

        MalwareAlert ma = new MalwareAlert();
        ma.threatId = "ALT-001";
        ma.source = "192.168.1.5";
        ma.severity = "Critical";
        ma.malwareType = "Ransomware";

        PhishingAlert pa = new PhishingAlert();
        pa.threatId = "ALT-002";
        pa.source = "evil.com";
        pa.severity = "High";
        pa.targetEmail = "admin@nsbm.ac.lk";

        DDoSAlert da = new DDoSAlert();
        da.threatId = "ALT-003";
        da.source = "10.0.0.99";
        da.severity = "Critical";
        da.packetCount = 50000;

        alerts[0] = ma;
        alerts[1] = pa;
        alerts[2] = da;

        for (SecurityAlert s : alerts) {
            s.logAlert();
            s.raiseAlert();
            System.out.println();
        }
    }
}