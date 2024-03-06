import java.util.Scanner;

public class ProductOfProducts {
    public static void main(String[] args) {
        int[] NewArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            NewArray[i] = scanner.nextInt();
        }
        int Products = 1;
        int Sum = 0;
        for (int j: NewArray) {
            Products *= j;
            Sum +=j;
        }
        System.out.println("Product "+Products);
        System.out.println("Sum "+Sum);
    }
}
