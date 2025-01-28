package SinglyLinkedList.SocialMediaFriendConnections;

import java.util.ArrayList;
import java.util.List;

// Class to represent a user
public class User {
    int id; // User ID
    String name; // User Name
    int age; // User Age
    List<Integer> friends; // List of Friend IDs
    User next; // Pointer to the next user

    // Constructor
    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}
