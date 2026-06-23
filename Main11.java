class ThreatDetector {
    void detectThreat() {
        System.out.println("Detecting threats...");
    }
}

class MalwareDetector extends ThreatDetector {
    @Override
    void detectThreat() {
        System.out.println("Malware threat detected.");
    }
}

class PhishingDetector extends ThreatDetector {
    @Override
    void detectThreat() {
        System.out.println("Phishing attack detected.");
    }
}

class IntrusionDetector extends ThreatDetector {
    @Override
    void detectThreat() {
        System.out.println("Intrusion attempt detected.");
    }
}

public class Main11 {
    public static void main(String[] args) {

        ThreatDetector[] detectors = {
            new MalwareDetector(),
            new PhishingDetector(),
            new IntrusionDetector()
        };

        System.out.println("Cyber Security Threat Detection System");

        for (ThreatDetector detector : detectors) {
            detector.detectThreat();
        }
    }
}