//  Demonstrates basic traversal of an integer array
package Snippets;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        // Traversal using classic for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        // Traversal using enhanced for-each loop
        System.out.println("\nUsing for-each loop:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}