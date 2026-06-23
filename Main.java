class Calculator {

    int add(int a, int b) {
        int result = a + b;
        System.out.println("Int sum: " + result);
        return result;
    }

    double add(double a, double b) {
        double result = a + b;
        System.out.println("Double sum: " + result);
        return result;
    }

    int add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Three-int sum: " + result);
        return result;
    }

    String add(String a, String b) {
        String result = a + b;
        System.out.println("String join: " + result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);
        c.add(10.5, 5.5);
        c.add(10, 20, 30);
        c.add("Hello ", "World");
    }
}