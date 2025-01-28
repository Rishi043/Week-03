package DoublyLinkedList.LibraryManagementSystem;


// Class to represent a book
public class Book {
    String title; // Book Title
    String author; // Author
    String genre; // Genre
    int id; // Book ID
    boolean available; // Availability Status
    Book next; // Pointer to the next book
    Book prev; // Pointer to the previous book

    // Constructor
    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

