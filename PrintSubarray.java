public class PrintSubarray {
    static void subArray(int[] arr) {
        // Outer loop: iterate over the starting index of the subarray
        for (int i = 0; i < arr.length; i++) {
            // Middle loop: iterate over the ending index of the subarray
            for (int j = i; j < arr.length; j++) {
                // Inner loop: iterate from the starting index to the ending index
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // Print a newline after printing each subarray
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        subArray(arr);
    }
}
