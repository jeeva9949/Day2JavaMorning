import java.util.Scanner;

public class Palindromesubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Split the input string into words
        String[] words = inputString.split("\\s+");

        // Initialize a StringBuilder to store the modified string
        StringBuilder modifiedString = new StringBuilder();

        // Process each word
        for (String word : words) {
            // Check if the word is a palindrome
            if (isPalindrome(word)) {
                // If it's a palindrome, replace it with asterisks
                modifiedString.append("*".repeat(word.length())).append(" ");
            } else {
                // If it's not a palindrome, keep the word unchanged
                modifiedString.append(word).append(" ");
            }
        }

        // Print the modified string
        System.out.println("Modified string: " + modifiedString.toString().trim());
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
