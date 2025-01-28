package DoublyLinkedList.MovieManagementSystem;

// Class to manage the movie records
public class MovieManagement {
    private Movie head; // Pointer to the first movie
    private Movie tail; // Pointer to the last movie

    // Add a movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position (1-based index)
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;
            if (current.next != null) current.next.prev = newMovie;
            current.next = newMovie;
        }
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        Movie current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current.prev != null) current.prev.next = current.next;
                if (current.next != null) current.next.prev = current.prev;

                if (current == head) head = current.next;
                if (current == tail) tail = current.prev;
                return;
            }
            current = current.next;
        }
    }

    // Search for a movie by director or rating
    public void searchMovie(String director, Double rating) {
        Movie current = head;

        while (current != null) {
            if ((director != null && current.director.equalsIgnoreCase(director)) ||
                    (rating != null && current.rating == rating)) {
                System.out.println("Title: " + current.title + ", Director: " + current.director +
                        ", Year: " + current.year + ", Rating: " + current.rating);
            }
            current = current.next;
        }
    }

    // Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        Movie current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                return;
            }
            current = current.next;
        }
    }

    // Display all movies in forward order
    public void displayForward() {
        Movie current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        Movie current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }
}