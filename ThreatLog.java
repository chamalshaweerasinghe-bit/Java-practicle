// ThreatLog.java

class ThreatLog {

    // Instance variables
    int score1, score2, score3, score4, score5;

    // Parameterized Constructor
    public ThreatLog(int s1, int s2, int s3, int s4, int s5) {

        score1 = s1;
        score2 = s2;
        score3 = s3;
        score4 = s4;
        score5 = s5;
    }

    // Method to print report
    public void printReport() {

        System.out.println("Threat Report");
        printThreat(score1);
        printThreat(score2);
        printThreat(score3);
        printThreat(score4);
        printThreat(score5);
    }

    // Helper method for classification
    public void printThreat(int score) {

        if (score >= 80) {
            System.out.println(score + " - Critical");

        } else if (score >= 60) {
            System.out.println(score + " - High");

        } else if (score >= 40) {
            System.out.println(score + " - Medium");

        } else {
            System.out.println(score + " - Low");
        }
    }

    // Method to find highest threat
    public int getHighestThreat() {

        int highest = score1;

        if (score2 > highest) {
            highest = score2;
        }

        if (score3 > highest) {
            highest = score3;
        }

        if (score4 > highest) {
            highest = score4;
        }

        if (score5 > highest) {
            highest = score5;
        }

        return highest;
    }

    // Method to count critical threats
    public int countCritical() {

        int count = 0;

        if (score1 >= 80) {
            count++;
        }

        if (score2 >= 80) {
            count++;
        }

        if (score3 >= 80) {
            count++;
        }

        if (score4 >= 80) {
            count++;
        }

        if (score5 >= 80) {
            count++;
        }

        return count;
    }
}