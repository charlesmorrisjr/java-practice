package inventory_stream;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    // User can add items to an HashMap
    public static void main(String[] args) {
        HashMap<String, Inventory> inventoryMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inventory App");
        System.out.println("=============");

        // Menu loop
        mainloop: while (true) {
            System.out.println("1. Add item to inventory");
            System.out.println("2. View items in inventory with a quantity greater than 5");
            System.out.println("3. Exit");

            System.out.print("Select option: ");
            String menuOption = scanner.nextLine();

            switch (menuOption) {
                case "1":
                    // Add item to inventory
                    while (true) {
                        System.out.print("Name of item to add to inventory (press Enter to return to main menu): ");
                        String itemName = scanner.nextLine();

                        // If nothing is entered, back to menu
                        if (itemName.isEmpty())
                            break;

                        // Get quantity
                        int itemAmount = 0;
                        while (itemAmount < 1) {
                            System.out.print("Quantity: ");
                            try {
                                itemAmount = Integer.parseInt(scanner.nextLine());
                            } catch (Exception e) {
                                System.out.print("Invalid quantity. Enter a positive number.");
                            }
                        }

                        if (inventoryMap.containsKey(itemName)) {
                            // If the item exists, add given quantity to its amount
                            Inventory existing = inventoryMap.get(itemName);

                            inventoryMap.put(itemName, new Inventory(existing.name(), existing.amount() + itemAmount));
                            System.out.println(
                                    "Increased " + itemName + " amount to " + (existing.amount() + itemAmount) + ".");
                        } else {
                            // Otherwise, add it as a new item
                            inventoryMap.put(itemName, new Inventory(itemName, itemAmount));
                            System.out.println("Added " + itemName + " to inventory.");
                        }

                        // Print out current inventory
                        System.out.println("Current inventory: ");
                        for (Inventory item : inventoryMap.values()) {
                            System.out.println(item.name() + ": " + item.amount());
                        }
                    }

                    break;

                case "2":
                    // View all items in inventory with quantity greater than or equal to 5
                    inventoryMap.values().stream()
                            .filter(item -> item.amount() >= 5)
                            .forEach(item -> System.out.println(item.name() + ": " + item.amount()));
                    break;

                case "3":
                    break mainloop;
            }
        }

        scanner.close();
    }
}
