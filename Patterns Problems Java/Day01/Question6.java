public class Question6 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                // Print star for first or last row
                // or first or last column
                if (i == 1 || i == rows || j == 1 || j == columns)
                    System.out.print("*");
                else
                    System.out.print(" "); // Otherwise, print space
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
