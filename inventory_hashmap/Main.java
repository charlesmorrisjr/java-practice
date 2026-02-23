package inventory_hashmap;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    // User can add items to an HashMap
    public static void main(String[] args) {
        HashMap<String, Inventory> inventoryMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name of item to add to inventory (press Enter to quit): ");
            String itemName = scanner.nextLine();

            // End the program if nothing is entered
            if (itemName.isEmpty())
                break;

            if (inventoryMap.containsKey(itemName)) {
                // If the item exists, add 1 to its amount
                Inventory existing = inventoryMap.get(itemName);

                inventoryMap.put(itemName, new Inventory(existing.name(), existing.amount() + 1));
                System.out.println("Increased " + itemName + " amount to " + (existing.amount() + 1) + ".");
            } else {
                // Otherwise, add it as a new item
                inventoryMap.put(itemName, new Inventory(itemName, 1));
                System.out.println("Added " + itemName + " to inventory.");
            }

            // Print out current inventory
            System.out.println("Current inventory: ");
            for (Inventory item : inventoryMap.values()) {
                System.out.println(item.name() + ": " + item.amount());
            }
        }

        scanner.close();
    }
}
