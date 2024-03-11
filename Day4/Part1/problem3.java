class Triangle {
    private double side1, side2, side3;

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public void printAreaAndPerimeter() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double perimeter = side1 + side2 + side3;

        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.printAreaAndPerimeter();
    }
}
