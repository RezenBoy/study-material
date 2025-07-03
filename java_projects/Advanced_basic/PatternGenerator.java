import java.util.Scanner;

public class PatternGenerator {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void squares(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
    }

    public static void primes(int n) {
        for (int i = 2, count = 0; count < n; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fibonacci\n2. Prime\n3. Squares");
        System.out.print("Choose a pattern: ");
        int choice = sc.nextInt();

        System.out.print("Enter count: ");
        int count = sc.nextInt();

        switch (choice) {
            case 1 -> fibonacci(count);
            case 2 -> primes(count);
            case 3 -> squares(count);
            default -> System.out.println("Invalid option.");
        }

        sc.close();
    }
}
