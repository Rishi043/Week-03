package SinglyLinkedList.StudentRecordManagement;

import java.sql.SQLOutput;

// Main class to test the system
public class Main {
    public static void main(String[] args) {
        StudentRecords records = new StudentRecords();

        // Add students
        records.addAtBeginning(1, "Alice", 20, "A");
        records.addAtEnd(2, "Bob", 22, "B");
        records.addAtEnd(3, "Charlie", 21, "A+");

        // Display all records
        records.displayAll();

        // Search a student
        records.searchByRollNumber(2);

        // Update grade
        records.updateGrade(3, "A");

        // Delete a student
        records.deleteByRollNumber(1);

        // Display updated records
        records.displayAll();
    }
}
