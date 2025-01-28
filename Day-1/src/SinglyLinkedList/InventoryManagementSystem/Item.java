package SinglyLinkedList.InventoryManagementSystem;


// Class to represent an inventory item
public class Item {
    String itemName;
    int itemID;
    int quantity;
    double price;
    Item next;

    // Constructor
    Item(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

