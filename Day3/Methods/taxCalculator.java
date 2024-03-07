/*5. Write a program that takes as input your gross salary and your total saving and uses another function named taxCalculator() to calculate your tax. The taxCalculator() function takes as parameters the gross salary as well as the total savings amount. The tax is calculated as follows:
(a) The savings is deducted from the gross income to calculate the taxable income. Maximum deduction of savings can be Rs. 100,000, even though the amount can be more than this.
(b) For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to 200,000 tax is 10% of the difference above 100,000 (Slab 1); beyond 200,000 up to 500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and then 20% of the taxable income exceeding 200,000 (Slab 2); if its more than 500,000, then the tax is tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.
*/

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gross salary: ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Enter your total savings: ");
        double totalSavings = scanner.nextDouble();

        double taxableIncome = calculateTaxableIncome(grossSalary, totalSavings);
        double tax = taxCalculator(taxableIncome);

        System.out.println("Taxable Income: Rs. " + taxableIncome);
        System.out.println("Tax Amount: Rs. " + tax);

        scanner.close();
    }

    private static double calculateTaxableIncome(double grossSalary, double savings) {
        double maxDeduction = 100000;
        double taxableIncome = Math.max(grossSalary - savings, 0);
        return Math.min(taxableIncome, maxDeduction);
    }

    private static double taxCalculator(double taxableIncome) {
        if (taxableIncome <= 100000) {
            return 0;
        } else if (taxableIncome <= 200000) {
            return 0.10 * (taxableIncome - 100000);
        } else if (taxableIncome <= 500000) {
            double slab1Tax = 0.10 * (200000 - 100000);
            double slab2Tax = 0.20 * (taxableIncome - 200000);
            return slab1Tax + slab2Tax;
        } else {
            double slab1Tax = 0.10 * (200000 - 100000);
            double slab2Tax = 0.20 * (500000 - 200000);
            double slab3Tax = 0.30 * (taxableIncome - 500000);
            return slab1Tax + slab2Tax + slab3Tax;
        }
    }
}
