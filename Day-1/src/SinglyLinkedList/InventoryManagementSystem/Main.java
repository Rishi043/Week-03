package SinglyLinkedList.InventoryManagementSystem;

// Main class to test the inventory system
public class Main {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        // Add items
        inventory.addAtBeginning("Item1", 101, 10, 5.5);
        inventory.addAtEnd("Item2", 102, 5, 15.0);
        inventory.addAtEnd("Item3", 103, 20, 2.5);

        // Display inventory
        inventory.displayInventory();

        // Search for items
        inventory.searchItem(102, null); // By ID
        inventory.searchItem(0, "Item3"); // By Name

        // Update quantity
        inventory.updateQuantity(103, 25);

        // Calculate total value
        inventory.calculateTotalValue();

        // Remove an item
        inventory.removeByID(101);

        // Sort by Name
        inventory.sortByName();
        inventory.displayInventory();

        // Sort by Price
        inventory.sortByPrice();
        inventory.displayInventory();
    }
}
