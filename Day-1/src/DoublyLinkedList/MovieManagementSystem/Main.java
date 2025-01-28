package DoublyLinkedList.MovieManagementSystem;

// Main class to test the Movie Management System
public class Main {
    public static void main(String[] args) {
        MovieManagement movies = new MovieManagement();

        // Adding movies
        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movies.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);

        // Display movies in forward and reverse order
        movies.displayForward();
        System.out.println("Reverse Order:");
        movies.displayReverse();

        // Search for movies
        System.out.println("Search by Director:");
        movies.searchMovie("Christopher Nolan", null);

        // Update rating
        movies.updateRating("Inception", 9.1);

        // Remove a movie
        movies.removeByTitle("The Dark Knight");

        // Display updated list
        System.out.println("Updated List:");
        movies.displayForward();
    }
}