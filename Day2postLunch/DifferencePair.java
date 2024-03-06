import java.util.Scanner;

public class DifferencePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxDiff = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int maxDiffIndex1 = -1, maxDiffIndex2 = -1;
        int minDiffIndex1 = -1, minDiffIndex2 = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxDiffIndex1 = i;
                    maxDiffIndex2 = j;
                }
                if (diff < minDiff) {
                    minDiff = diff;
                    minDiffIndex1 = i;
                    minDiffIndex2 = j;
                }
            }
        }

        System.out.println("Maximum difference pair:");
        System.out.println("Elements: " + arr[maxDiffIndex1] + ", " + arr[maxDiffIndex2]);
        System.out.println("Maximum difference: " + maxDiff);

        System.out.println("\nMinimum difference pair:");
        System.out.println("Elements: " + arr[minDiffIndex1] + ", " + arr[minDiffIndex2]);
        System.out.println("Minimum difference: " + minDiff);

        scanner.close();
    }
}
