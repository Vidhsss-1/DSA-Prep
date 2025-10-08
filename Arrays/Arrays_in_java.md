Arrays in Java
1. Introduction

An array in Java is a linear data structure that allows you to store multiple values of the same type.
Arrays are objects in Java and inherit from java.lang.Object. This allows access to methods like toString(), equals(), and hashCode().

Each array has a built-in length property that gives the number of elements.

2. Key Features

Store Primitives and Objects: Arrays can hold primitive types (int, char, boolean) and objects (String, Integer, custom objects).

Contiguous Memory Allocation: Primitive types are stored contiguously; object references are stored contiguously.

Zero-based Indexing: First element is at index 0.

Fixed Length: Once created, size cannot be changed.

3. Declaration and Initialization
Declaration
int arr[];   // Method 1
int[] arr;   // Method 2

Initialization
int arr[] = new int[5];          // Allocate memory
int[] arr2 = {1, 2, 3, 4, 5};    // Array literal


Note: Memory is allocated on the heap, and primitive types are initialized to 0, booleans to false, and objects to null.

4. Access and Update
arr[0] = 10;        // Update first element
int first = arr[0]; // Access first element


Length of array:

int n = arr.length;

5. Traversing Arrays
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

6. Arrays of Objects
class Student {
    int roll_no;
    String name;
    Student(int r, String n) { roll_no = r; name = n; }
}

Student[] arr = new Student[5];
arr[0] = new Student(1, "Aman");

7. Array Exceptions

Accessing an index outside [0, length-1] throws ArrayIndexOutOfBoundsException.

int[] arr = new int[3];
System.out.println(arr[5]);  // ❌ Error

8. Passing Arrays to Methods
public static void sum(int[] arr) {
    int total = 0;
    for (int num : arr) total += num;
    System.out.println(total);
}

int[] arr = {1,2,3,4};
sum(arr);

9. Returning Arrays from Methods
public static int[] getArray() {
    return new int[]{1, 2, 3};
}
int[] arr = getArray();

10. Advantages

Efficient Access: O(1) to access by index.

Memory Management: Fixed size simplifies memory handling.

Data Organization: Groups related elements.

11. Disadvantages

Fixed Size: Cannot grow or shrink dynamically.

Homogeneity: Only stores elements of the same type.

Insertion/Deletion Costly: Middle operations require shifting elements.

12. Snippets

All example programs are in the Arrays/snippets folder:

File	Description
ArrayTraversal.java	Traversing and printing arrays
ArrayInitialization.java	Different ways to declare and initialize arrays
ArrayUtilities.java	Array utility methods (sort, max, min, etc.)
PassArrayToMethod.java	Passing arrays to methods and summing values
MultiDimArray.java	Example of 2D arrays
ObjectArrayExample.java	Working with arrays of objects

Tip: You can run these directly in VS Code (click Run button).

13. Repository Structure
DSA-Prep/
└─ Arrays/
   ├─ Arrays_in_java.md       # This README/notes
   ├─ snippets/               # Example programs/snippets
   │   ├─ ArrayTraversal.java
   │   ├─ ArrayInitialization.java
   │   ├─ ArrayUtilities.java
   │   ├─ PassArrayToMethod.java
   │   ├─ MultiDimArray.java
   │   └─ ObjectArrayExample.java
   └─ problems/               # Solved array problems
       └─ TwoSum.java