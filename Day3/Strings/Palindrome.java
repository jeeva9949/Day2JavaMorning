import java.util.ResourceBundle;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("enter the string = ");
        Scanner scanner = new Scanner(System.in);

        String InputString = scanner.nextLine();
        scanner.close();

        StringBuilder reversedString = new StringBuilder(InputString).reverse();
        System.out.println("Reverse of string: ");
        System.out.println(reversedString);
    }
}
