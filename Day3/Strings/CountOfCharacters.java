import java.util.Scanner;

public class CountOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();


        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int whitespaceCount = 0;

        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantCount++;
            }
            else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
            else if (Character.isWhitespace(ch)) {
                whitespaceCount++;
            }
        }


        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of whitespace characters: " + whitespaceCount);
    }
}
