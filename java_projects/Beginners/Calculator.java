import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operation (+ - * /): ");
            String op = sc.next();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (op) {
                case "+" -> System.out.println("Result: " + (num1 + num2));
                case "-" -> System.out.println("Result: " + (num1 - num2));
                case "*" -> System.out.println("Result: " + (num1 * num2));
                case "/" -> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                }
                default -> System.out.println("Invalid operation.");
            }

            System.out.print("Do you want to calculate again? (yes/no): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        sc.close();
    }
}
