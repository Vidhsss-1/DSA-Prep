// Arrays/snippets/PassArrayToMethod.java
// Demonstrates passing arrays to methods
package Snippets;

public class PassArrayToMethod {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum: " + sum(arr));
    }

    // Method accepts an array
    static int sum(int[] arr) {
        int total = 0;
        for (int num : arr)
            total += num;
        return total;
    }
}
