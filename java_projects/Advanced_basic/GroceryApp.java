import java.util.*;

public class GroceryApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nGrocery Menu:");
            System.out.println("1. Add item\n2. Remove item\n3. View list\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter item to add: ");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Added!");
                }
                case 2 -> {
                    System.out.print("Enter item to remove: ");
                    String item = sc.nextLine();
                    if (list.remove(item)) {
                        System.out.println("Removed!");
                    } else {
                        System.out.println("Not found!");
                    }
                }
                case 3 -> {
                    System.out.println("🛒 Your List:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
