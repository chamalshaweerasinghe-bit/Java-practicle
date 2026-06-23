// Main.java

public class Main {

    public static void main(String[] args) {

        // Creating object
        ThreatLog t1 = new ThreatLog(91, 55, 38, 74, 62);

        // Calling printReport method
        t1.printReport();

        // Calling getHighestThreat method
        System.out.println("\nHighest Threat Score: " + t1.getHighestThreat());

        // Calling countCritical method
        System.out.println("Critical Threat Count: " + t1.countCritical());
    }
}