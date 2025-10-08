// Arrays/snippets/ArrayInitialization.java
// Demonstrates different ways to initialize arrays
package Snippets;

public class ArrayInitialization {
    public static void main(String[] args) {
        // Static initialization
        int[] arr1 = { 1, 2, 3, 4, 5 };

        // Dynamic initialization
        int[] arr2 = new int[5]; // default 0s
        arr2[0] = 10;
        arr2[1] = 20;

        System.out.println("arr1: ");
        for (int i : arr1)
            System.out.print(i + " ");
        System.out.println("\narr2: ");
        for (int i : arr2)
            System.out.print(i + " ");
    }
}
