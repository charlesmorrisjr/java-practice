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

            if (!itemName.isEmpty()) {
                Inventory newItem = new Inventory(itemName);
                inventoryList.add(newItem);
                System.out.println("Added " + itemName + " to inventory.");
            } else {
                break;
            }

            // Print out current inventory
            System.out.println("Current inventory: ");
            for (Inventory item : inventoryList) {
                System.out.println(item.name());
            }
        }

        scanner.close();
    }
}
