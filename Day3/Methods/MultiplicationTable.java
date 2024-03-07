/*3. Print the multiplication table of 15 using recursion.
*/

public class Problem03 {
    public static void main(String[] args) {
        int number = 15;
        printMultiplicationTable(number, 1);
    }

    private static void printMultiplicationTable(int num, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(num + " × " + multiplier + " = " + (num * multiplier));
            printMultiplicationTable(num, multiplier + 1);
        }
    }
}
