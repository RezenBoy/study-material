import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Pyramid\n2. Square\n3. Triangle");
        System.out.print("Choose a pattern: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        switch (choice) {
            case 1 -> {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < rows - i; j++) System.out.print(" ");
                    for (int j = 0; j < i; j++) System.out.print("* ");
                    System.out.println();
                }
            }
            case 2 -> {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < rows; j++) System.out.print("* ");
                    System.out.println();
                }
            }
            case 3 -> {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 0; j < i; j++) System.out.print("* ");
                    System.out.println();
                }
            }
            default -> System.out.println("Invalid option!");
        }

        sc.close();
    }
}
