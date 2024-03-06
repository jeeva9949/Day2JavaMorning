import java.util.Scanner;
public class EnterQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long product = 1;

        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            boolean isValidInteger = true;
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    isValidInteger = false;
                    break;
                }
            }

            if (isValidInteger) {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the numbers: " + average);
            System.out.println("Product of the numbers: " + product);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
