package SinglyLinkedList.InventoryManagementSystem;

// Class to manage the inventory with linked list operations
public class InventoryManagement {
    private Item head;

    // Add an item at the beginning
    public void addAtBeginning(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end
    public void addAtEnd(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item current = head;
        while (current.next != null) current = current.next;
        current.next = newItem;
    }

    // Remove an item by Item ID
    public void removeByID(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemID == id) {
            head = head.next;
            System.out.println("Removed item with ID: " + id);
            return;
        }
        Item current = head;
        while (current.next != null && current.next.itemID != id) current = current.next;
        if (current.next == null) System.out.println("Item with ID " + id + " not found.");
        else {
            current.next = current.next.next;
            System.out.println("Removed item with ID: " + id);
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantity(int id, int qty) {
        Item current = head;
        while (current != null) {
            if (current.itemID == id) {
                current.quantity = qty;
                System.out.println("Updated quantity for item ID: " + id + " to " + qty);
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Search for an item by ID or Name
    public void searchItem(int id, String name) {
        Item current = head;
        while (current != null) {
            if (current.itemID == id || current.itemName.equalsIgnoreCase(name)) {
                System.out.println("Found: Item Name: " + current.itemName + ", ID: " + current.itemID +
                        ", Quantity: " + current.quantity + ", Price: " + current.price);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    // Calculate and display the total inventory value
    public void calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    // Sort items by Name (ascending order)
    public void sortByName() {
        if (head == null || head.next == null) return;
        head = mergeSortByName(head);
        System.out.println("Inventory sorted by name.");
    }

    // Sort items by Price (ascending order)
    public void sortByPrice() {
        if (head == null || head.next == null) return;
        head = mergeSortByPrice(head);
        System.out.println("Inventory sorted by price.");
    }

    // Merge sort implementation for sorting by name
    private Item mergeSortByName(Item head) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextToMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByName(head);
        Item right = mergeSortByName(nextToMiddle);
        return mergeByName(left, right);
    }

    // Merge sort implementation for sorting by price
    private Item mergeSortByPrice(Item head) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextToMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByPrice(head);
        Item right = mergeSortByPrice(nextToMiddle);
        return mergeByPrice(left, right);
    }

    // Merge two sorted lists by name
    private Item mergeByName(Item a, Item b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.itemName.compareToIgnoreCase(b.itemName) < 0) {
            a.next = mergeByName(a.next, b);
            return a;
        } else {
            b.next = mergeByName(a, b.next);
            return b;
        }
    }

    // Merge two sorted lists by price
    private Item mergeByPrice(Item a, Item b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.price < b.price) {
            a.next = mergeByPrice(a.next, b);
            return a;
        } else {
            b.next = mergeByPrice(a, b.next);
            return b;
        }
    }

    // Get the middle node of the list
    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display all items
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory Records:");
        Item current = head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", ID: " + current.itemID +
                    ", Quantity: " + current.quantity + ", Price: $" + current.price);
            current = current.next;
        }
    }
}

