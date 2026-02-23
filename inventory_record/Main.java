package inventory_record;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // User can add items to an ArrayList
    public static void main(String[] args) {
        ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name of item to add to inventory (press Enter to quit): ");
            String itemName = scanner.nextLine();

            // If itemName is not empty, add it to the inventory
            if (!itemName.isEmpty()) {
                Inventory existingItem = null;
                int existingIndex = -1;

                // Search the inventory and see if the item already exists
                for (int i = 0; i < inventoryList.size(); i++) {
                    if (inventoryList.get(i).name().equalsIgnoreCase(itemName)) {
                        existingItem = inventoryList.get(i);
                        existingIndex = i;
                        break;
                    }
                }

                // If the item exists, add 1 to its amount
                if (existingItem != null) {
                    inventoryList.set(existingIndex, new Inventory(existingItem.name(), existingItem.amount() + 1));
                    System.out.println("Increased " + itemName + " amount to " + (existingItem.amount() + 1) + ".");
                    // Otherwise, add it as a new item
                } else {
                    inventoryList.add(new Inventory(itemName, 1));
                    System.out.println("Added " + itemName + " to inventory.");
                }

                // Otherwise, end the program
            } else {
                break;
            }

            // Print out current inventory
            System.out.println("Current inventory: ");
            for (Inventory item : inventoryList) {
                System.out.println(item.name() + ": " + item.amount());
            }
        }

        scanner.close();
    }
}
