public class SortedArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 45, 15};

        System.out.println("Initial Array:");
        printArray(array);
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                System.out.print("After Each swap : ");
                printArray(array);
            }

        }

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
