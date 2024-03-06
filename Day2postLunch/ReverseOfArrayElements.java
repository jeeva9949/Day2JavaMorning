import java.util.Scanner;

public class ReverseOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] originalArray = new int[10];
        System.out.println("Enter 10 integers:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer");
            originalArray[i] = scanner.nextInt();
        }


        int[] reversedArray = new int[10];


        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }


        scanner.close();

        System.out.println("Reversed array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();
    }
}
