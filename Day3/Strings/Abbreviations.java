import java.util.Scanner;

// Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.


public class Abbreviations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        scanner.close();


        String[] nameParts = fullName.split(" ");

        StringBuilder abbreviatedName = new StringBuilder();


        for (int i = 0; i < nameParts.length; i++) {
            if (i == nameParts.length - 1) {
                abbreviatedName.append(nameParts[i]);
            } else {
                abbreviatedName.append(nameParts[i].charAt(0)).append(".");
            }
        }
        System.out.println("Abbreviated Name: " + abbreviatedName.toString());
    }
}
