package DoublyLinkedList.LibraryManagementSystem;

// Main class to test the Library Management System
public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        // Adding books
        library.addAtBeginning("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true);
        library.addAtEnd("1984", "George Orwell", "Dystopian", 102, true);
        library.addAtPosition(2, "To Kill a Mockingbird", "Harper Lee", "Fiction", 103, false);

        // Display books
        library.displayForward();

        // Search for books
        System.out.println("\nSearch Results:");
        library.searchBook("1984", null);

        // Update availability
        library.updateAvailability(103, true);

        // Remove a book
        library.removeById(101);

        // Display in reverse order
        System.out.println("\nAfter Updates:");
        library.displayReverse();

        // Count books
        library.countBooks();
    }
}

