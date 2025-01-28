package SinglyLinkedList.SocialMediaFriendConnections;
// Main class to test the social media system
public class Main {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        // Add users
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 24);
        sm.addUser(3, "Charlie", 23);

        // Add friend connections
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);

        // Display all users
        sm.displayAllUsers();

        // Display friends of a specific user
        sm.displayFriends(1);

        // Find mutual friends
        sm.findMutualFriends(1, 2);

        // Search for a user
        sm.searchUser(2, null);
        sm.searchUser(0, "Charlie");

        // Remove a friend connection
        sm.removeFriend(1, 2);

        // Display friends after removal
        sm.displayFriends(1);

        // Count friends for each user
        sm.countFriends();
    }
}
