package DoublyLinkedList.LibraryManagementSystem;

// Class to manage the library
class LibraryManagement {
    private Book head; // Pointer to the first book
    private Book tail; // Pointer to the last book
    private int totalBooks = 0; // Count of books in the library

    // Add a book at the beginning
    public void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    // Add a book at the end
    public void addAtEnd(String title, String author, String genre, int id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    // Add a book at a specific position (1-based index)
    public void addAtPosition(int position, String title, String author, String genre, int id, boolean available) {
        if (position <= 1 || head == null) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }
        Book newBook = new Book(title, author, genre, id, available);
        Book current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            addAtEnd(title, author, genre, id, available);
        } else {
            newBook.next = current.next;
            newBook.prev = current;
            current.next.prev = newBook;
            current.next = newBook;
        }
        totalBooks++;
    }

    // Remove a book by ID
    public void removeById(int id) {
        Book current = head;

        while (current != null) {
            if (current.id == id) {
                if (current.prev != null) current.prev.next = current.next;
                if (current.next != null) current.next.prev = current.prev;

                if (current == head) head = current.next;
                if (current == tail) tail = current.prev;

                totalBooks--;
                return;
            }
            current = current.next;
        }
    }

    // Search for a book by Title or Author
    public void searchBook(String title, String author) {
        Book current = head;
        boolean found = false;

        while (current != null) {
            if ((title != null && current.title.equalsIgnoreCase(title)) ||
                    (author != null && current.author.equalsIgnoreCase(author))) {
                System.out.println("Title: " + current.title + ", Author: " + current.author +
                        ", Genre: " + current.genre + ", ID: " + current.id +
                        ", Available: " + (current.available ? "Yes" : "No"));
                found = true;
            }
            current = current.next;
        }

        if (!found) System.out.println("No matching book found.");
    }

    // Update a book's availability status by ID
    public void updateAvailability(int id, boolean available) {
        Book current = head;

        while (current != null) {
            if (current.id == id) {
                current.available = available;
                return;
            }
            current = current.next;
        }
    }

    // Display all books in forward order
    public void displayForward() {
        Book current = head;
        System.out.println("Books in the Library:");
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", ID: " + current.id +
                    ", Available: " + (current.available ? "Yes" : "No"));
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        Book current = tail;
        System.out.println("Books in Reverse Order:");
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", ID: " + current.id +
                    ", Available: " + (current.available ? "Yes" : "No"));
            current = current.prev;
        }
    }

    // Count the total number of books
    public void countBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }
}

