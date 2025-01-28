package SinglyLinkedList.StudentRecordManagement;

// Class to represent a student record
public class Student {
        int rollNumber;
        String name;
        int age;
        String grade;
        Student next;

        // Constructor

        Student(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
}
