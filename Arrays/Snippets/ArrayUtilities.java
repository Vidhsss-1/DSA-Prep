// Arrays/snippets/ArrayUtilities.java
// Demonstrates utility methods from java.util.Arrays
package Snippets;

import java.util.Arrays;

public class ArrayUtilities {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };

        // Sorting
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Copying
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        // Fill
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled array: " + Arrays.toString(filled));
    }
}
