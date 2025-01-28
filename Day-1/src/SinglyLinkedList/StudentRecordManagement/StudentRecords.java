package SinglyLinkedList.StudentRecordManagement;

// Class to manage student records with basic operations
public class StudentRecords {
    private Student head;

    // Add a student at the beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a student at the end
    public void addAtEnd(int roll, String name, int age, String grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null)
            current = current.next;
        current.next = newStudent;
    }

    // Delete a student by roll number
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Deleted student with roll number: " + roll);
            return;
        }
        Student current = head;
        while (current.next != null && current.next.rollNumber != roll)
            current = current.next;
        if (current.next == null)
            System.out.println("Student with roll number " + roll + " not found.");
        else {
            current.next = current.next.next;
            System.out.println("Deleted student with roll number: " + roll);
        }
    }

    // Search for a student by roll number
    public void searchByRollNumber(int roll) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                System.out.println("Found: Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + roll + " not found.");
    }

    // Update grade by roll number
    public void updateGrade(int roll, String grade) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                current.grade = grade;
                System.out.println("Updated grade for roll number " + roll + " to " + grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with roll number " + roll + " not found.");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }
        System.out.println("Student Records:");
        Student current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
}

