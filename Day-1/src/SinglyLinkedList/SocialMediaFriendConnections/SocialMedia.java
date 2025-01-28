package SinglyLinkedList.SocialMediaFriendConnections;

import java.util.ArrayList;
import java.util.List;

    // Class to manage the social media friend connections
    public class SocialMedia {
        private User head; // Head of the user list

        // Add a new user
        public void addUser(int id, String name, int age) {
            User newUser = new User(id, name, age);
            newUser.next = head; // Insert at the beginning
            head = newUser;
            System.out.println("Added User: " + name + " (ID: " + id + ")");
        }

        // Add a friend connection between two users
        public void addFriend(int id1, int id2) {
            User user1 = findUser(id1);
            User user2 = findUser(id2);

            // Check if both users exist
            if (user1 == null || user2 == null) {
                System.out.println("One or both users not found.");
                return;
            }

            // Add each user to the other's friend list (if not already added)
            if (!user1.friends.contains(id2)) user1.friends.add(id2);
            if (!user2.friends.contains(id1)) user2.friends.add(id1);

            System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
        }

        // Remove a friend connection between two users
        public void removeFriend(int id1, int id2) {
            User user1 = findUser(id1);
            User user2 = findUser(id2);

            // Check if both users exist
            if (user1 == null || user2 == null) {
                System.out.println("One or both users not found.");
                return;
            }

            // Remove each user from the other's friend list
            user1.friends.remove(Integer.valueOf(id2));
            user2.friends.remove(Integer.valueOf(id1));

            System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
        }

        // Find mutual friends between two users
        public void findMutualFriends(int id1, int id2) {
            User user1 = findUser(id1);
            User user2 = findUser(id2);

            // Check if both users exist
            if (user1 == null || user2 == null) {
                System.out.println("One or both users not found.");
                return;
            }

            // Find mutual friends
            List<Integer> mutual = new ArrayList<>();
            for (int friendId : user1.friends) {
                if (user2.friends.contains(friendId)) mutual.add(friendId);
            }

            System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ": " + mutual);
        }

        // Display all friends of a specific user
        public void displayFriends(int id) {
            User user = findUser(id);

            if (user == null) {
                System.out.println("User not found.");
                return;
            }

            System.out.println(user.name + "'s Friends: " + user.friends);
        }

        // Search for a user by ID or Name
        public void searchUser(int id, String name) {
            User current = head;

            while (current != null) {
                if (current.id == id || (name != null && current.name.equalsIgnoreCase(name))) {
                    System.out.println("Found User - ID: " + current.id + ", Name: " + current.name + ", Age: " + current.age);
                    return;
                }
                current = current.next;
            }

            System.out.println("User not found.");
        }

        // Count the number of friends for each user
        public void countFriends() {
            User current = head;

            while (current != null) {
                System.out.println(current.name + " has " + current.friends.size() + " friends.");
                current = current.next;
            }
        }

        // Display all users
        public void displayAllUsers() {
            if (head == null) {
                System.out.println("No users in the system.");
                return;
            }

            System.out.println("All Users:");
            User current = head;

            while (current != null) {
                System.out.println("ID: " + current.id + ", Name: " + current.name + ", Age: " + current.age);
                current = current.next;
            }
        }

        // Helper method to find a user by ID
        private User findUser(int id) {
            User current = head;

            while (current != null) {
                if (current.id == id) return current;
                current = current.next;
            }

            return null; // User not found
        }
    }
