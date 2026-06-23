public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

  
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Result of add(int, int): " + calc.add(10, 20));
        System.out.println("Result of add(int, int, int): " + calc.add(10, 20, 30));
        System.out.println("Result of add(double, double): " + calc.add(10.5, 20.5));
    }
}