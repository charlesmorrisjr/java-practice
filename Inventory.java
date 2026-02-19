import java.util.Scanner;
import java.util.ArrayList;

public class Inventory {
    // User can add items to an ArrayList
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name of item to add to inventory (press Enter to quit): ");
            String itemName = scanner.nextLine();

            if (!itemName.isEmpty()) {
                items.add(itemName);
            } else {
                break;
            }

            System.out.println("Added " + itemName + " to inventory.");
            System.out.println(items.toString());
        }

        scanner.close();
    }
}
