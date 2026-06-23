public class RectangleAreaCalculator {

  
    private double length;
    private double width;

    
    RectangleAreaCalculator(double length, double width) {
        this.length = length;
        this.width = width;
    }

 
    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

     
        RectangleAreaCalculator rect =
                new RectangleAreaCalculator(10, 5);

 
        double area = rect.calculateArea();

        System.out.println("Area of Rectangle: " + area);
    }
}