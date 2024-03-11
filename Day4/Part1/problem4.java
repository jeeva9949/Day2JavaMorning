import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public Area(double l, double b) {
        length = l;
        breadth = b;
    }

    public double returnArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        Area rectangle = new Area(length, breadth);

        System.out.println("Area of the rectangle: " + rectangle.returnArea());
    }
}
