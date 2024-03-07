/*1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
*/

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double max = findMax(num1, num2, num3);
        double min = findMin(num1, num2, num3);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        scanner.close();
    }

    private static double findMax(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    private static double findMin(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
}
