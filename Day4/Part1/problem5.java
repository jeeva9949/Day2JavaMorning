import java.util.Scanner;

class Average {
    public void calculateAndPrintAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter number 3: ");
        double num3 = scanner.nextDouble();

        Average averageCalculator = new Average();
        averageCalculator.calculateAndPrintAverage(num1, num2, num3);
    }
}
