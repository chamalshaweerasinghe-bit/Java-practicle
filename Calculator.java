class Calculator {
    int num1;
    int num2;

    Calculator() {
        num1 = 10;
        num2 = 5;
    }

    // non para - non return type method
    void printMag() {
        System.out.println("Welcome to the 25.3 VU batch for the calculator");
    }

    // non para - return type method
    int addNumbers() {
        int sum = num1 + num2;
        return sum;
    }

    // para - non return type method
    void subNumber(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("Sub is : " + sub);
    }

    // para - return type method
    int multiplyNumber(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }
}

// Separate main class
class CalApp {
    public static void main(String[] args) {

        // create object
        Calculator cl = new Calculator();

        // call methods
        cl.printMag();

        int sum = cl.addNumbers();
        System.out.println("Sum is : " + sum);

        cl.subNumber(20, 10);

        int mul = cl.multiplyNumber(50, 2);
        System.out.println("Multiplication is : " + mul);
    }
}