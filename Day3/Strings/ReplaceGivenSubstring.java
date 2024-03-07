import java.util.Scanner;
public class ReplaceGivenSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacementString = scanner.nextLine();

        String modifiedSentence = sentence.replace(substringToReplace, replacementString);

        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }
}
