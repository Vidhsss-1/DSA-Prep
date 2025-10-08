// Arrays/snippets/ObjectArrayExample.java
// Demonstrates array of objects
package Snippets;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class ObjectArrayExample {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Aman");
        students[1] = new Student(2, "Vaibhav");
        students[2] = new Student(3, "Shikhar");

        for (Student s : students) {
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}
