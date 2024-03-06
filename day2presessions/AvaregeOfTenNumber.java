import java.util.Scanner;
public class AvaregeOfTenNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        double average = (double) sum / 10;
        System.out.println("Average value of the 10 integers: " + average);
        scanner.close();
    }
}
