
class Printer {

   
    void print(String message) {
        System.out.println("Message: " + message);
    }

    
    void print(int value) {
        System.out.println("Value: " + value);
    }

    
    void print(String message, int copies) {
        for (int i = 1; i <= copies; i++) {
            System.out.println("Copy " + i + ": " + message);
        }
    }
}

public class Main7 {
    public static void main(String[] args) {

        Printer p = new Printer();

        p.print("Hello World");
        p.print(100);
        p.print("Java Programming", 3);
    }
}