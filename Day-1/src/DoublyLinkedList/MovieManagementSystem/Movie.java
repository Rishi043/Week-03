package DoublyLinkedList.MovieManagementSystem;

// Class to represent a movie
public class Movie {
    String title; // Movie Title
    String director; // Director
    int year; // Year of Release
    double rating; // Rating
    Movie next; // Pointer to the next movie
    Movie prev; // Pointer to the previous movie

    // Constructor
    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
