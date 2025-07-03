import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        double balance = 1000.0;
        String pin = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String enteredPin = sc.nextLine();

        if (!enteredPin.equals(pin)) {
            System.out.println("Incorrect PIN!");
            return;
        }

        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Balance: ₹" + balance);
                case 2 -> {
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount deposited.");
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Amount withdrawn.");
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using the ATM.");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
