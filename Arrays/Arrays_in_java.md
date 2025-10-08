# 📘 Arrays in Java

Arrays are **fixed-size data structures** that store elements of the **same type** in contiguous memory locations.  
They provide **fast access** to elements using indices (zero-based indexing).

---

## 🧠 1. Array Basics

### 📌 Declaration
```java
int[] arr;        // Preferred way
int arr2[];       // Also valid (less common)

📌 Initialization
arr = new int[5]; // Creates array of 5 integers, default 0s

📌 Declaration + Initialization (together)
int[] arr = {1, 2, 3, 4, 5};

📌 Accessing Elements
System.out.println(arr[0]); // prints 1
arr[2] = 10;                // modifies element at index 2

⚙️ 2. Array Traversal
Using for loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

Using for-each loop
for (int num : arr) {
    System.out.println(num);
}

🧩 3. Arrays as Parameters

Arrays can be passed to methods by reference, meaning changes inside the method affect the original array.

public class PassArrayExample {
    static void modifyArray(int[] a) {
        a[0] = 100;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.println(arr[0]); // Output: 100
    }
}

🧰 4. Common Operations
Operation	Example	Description
Get length	arr.length	Number of elements
Sort array	Arrays.sort(arr)	Sorts in ascending order
Convert to string	Arrays.toString(arr)	Prints array nicely
Copy array	Arrays.copyOf(arr, n)	Copies first n elements

🧩 Import required class:

import java.util.Arrays;

⚠️ 5. Common Mistakes
Mistake	Explanation
ArrayIndexOutOfBoundsException	Accessing invalid index (like arr[5] in size 5 array)
Using arr.length()	Wrong — it’s a field, not a method (arr.length ✔)
Forgetting to initialize array	Leads to NullPointerException
🔄 6. Multi-Dimensional Arrays
Example
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

Traversal
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

🧮 7. Utility Class – Arrays

Java provides the java.util.Arrays class for easy array handling.

Common Methods
Arrays.sort(arr);             // Sorts array
Arrays.equals(arr1, arr2);    // Compares arrays
Arrays.copyOf(arr, newLen);   // Copies array
Arrays.fill(arr, 0);          // Fills all elements with 0

🧠 Summary
Topic	Key Point
Declaration	int[] arr = new int[5];
Access	arr[i]
Traversal	for / for-each loop
Length	arr.length
Library	java.util.Arrays
Multi-dimensional	Nested arrays like int[][]