class Printer {

    void printData(String text) {
        System.out.println("Printing text: " + text);
    }

    void printData(int number) {
        System.out.println("Printing number: " + number);
    }

    void printData(String text, int copies) {
        System.out.println("Printing " + copies + " copies of: " + text);
    }

    void printData(boolean isDuplex) {
        System.out.println("Duplex printing: " + isDuplex);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Printer p = new Printer();

        p.printData("NSBM");
        p.printData(100);
        p.printData("Java Notes", 5);
        p.printData(true);
    }
}