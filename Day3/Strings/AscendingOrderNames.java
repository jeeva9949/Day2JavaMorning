import java.util.Arrays;
import java.util.Scanner;
public class AscendingOrderNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = new String[10];

        System.out.println("Enter 10 friend names:");
        for (int i = 0; i < 10; i++) {
            friends[i] = scanner.nextLine();
        }

        Arrays.sort(friends);

        System.out.println("\nSorted friend names (in alphabetical order):");
        for (String friend : friends) {
            System.out.println(friend);
        }

        scanner.close();
    }
}
