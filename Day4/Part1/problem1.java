import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    public double getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        rectangle.setDim(length, breadth);

        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
