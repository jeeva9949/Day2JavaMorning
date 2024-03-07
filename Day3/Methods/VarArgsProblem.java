/*5. Write a program to find the sum and product of all elements of an array.
*/

public class VarArgsProblem {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 11 };

        int sum = calculateSum(arr);
        long product = calculateProduct(arr);

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }

    private static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static long calculateProduct(int... numbers) {
        long product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
}
