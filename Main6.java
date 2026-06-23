class Threat {
    String threatId;
    String source;
    String severity;

    void logThreat() {
        System.out.println("[THREAT LOG] ID: " + threatId +
                " | Source: " + source +
                " | Severity: " + severity);
    }

    void raiseAlert() {
        System.out.println("!! SECURITY ALERT !! Threat " +
                threatId + " detected from " + source);
    }
}

class MalwareAttack extends Threat {
    String malwareType;

    void quarantine() {
        System.out.println("Quarantining " + malwareType + " from " + source + "...");
    }
}

class PhishingAttack extends Threat {
    String targetEmail;

    void blockEmail() {
        System.out.println("Blocking phishing email targeting: " + targetEmail);
    }
}

class DDoSAttack extends Threat {
    int packetCount;

    void mitigate() {
        System.out.println("Mitigating DDoS from " + source +
                " — " + packetCount + " packets dropped");
    }
}

public class Main6 {
    public static void main(String[] args) {

        MalwareAttack m = new MalwareAttack();
        m.threatId = "M-01";
        m.source = "192.168.0.5";
        m.severity = "High";
        m.malwareType = "Ransomware";

        m.logThreat();
        m.raiseAlert();
        m.quarantine();

        PhishingAttack p = new PhishingAttack();
        p.threatId = "P-01";
        p.source = "email@fake.com";
        p.severity = "Medium";
        p.targetEmail = "user@gmail.com";

        p.logThreat();
        p.raiseAlert();
        p.blockEmail();

        DDoSAttack d = new DDoSAttack();
        d.threatId = "D-01";
        d.source = "10.0.0.1";
        d.severity = "Critical";
        d.packetCount = 50000;

        d.logThreat();
        d.raiseAlert();
        d.mitigate();
    }
}