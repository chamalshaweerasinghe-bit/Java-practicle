class Shape {

    void draw() {
        System.out.println("Drawing a generic shape");
    }

    void area() {
        System.out.println("Area: 0.0");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void area() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    void area() {
        System.out.println("Area: " + (width * height));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void area() {
        System.out.println("Area: " + (0.5 * base * height));
    }
}

public class Main4 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 8);

        for (Shape s : shapes) {
            s.draw();
            s.area();
            System.out.println();
        }
    }
}