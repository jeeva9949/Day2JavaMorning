public class Question2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            // space
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}