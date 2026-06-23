class CalApp {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.printMag();

        int sum = c1.addNumbers();
        System.out.println("Sum is: " + sum);

        c1.subNumber(20, 10);

        int mul = c1.multyplyNumber(50, 2);
        System.out.println("Multiplication is " + mul);
    }
}