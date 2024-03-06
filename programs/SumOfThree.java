import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int firstDigit = number / 10000;
        int secondLastDigit = (number / 10) % 10;
        int sum = firstDigit + secondLastDigit;
        System.out.println("firstDigit + SecondsLastDigit "+ sum);
    }
}
