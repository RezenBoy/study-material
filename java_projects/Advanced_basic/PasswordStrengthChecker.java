import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        int strength = 0;
        if (password.length() >= 8) strength++;
        if (password.matches(".*\\d.*")) strength++;
        if (password.matches(".*[A-Z].*")) strength++;
        if (password.matches(".*[!@#$%^&*()].*")) strength++;

        System.out.print("🔍 Strength: ");
        switch (strength) {
            case 4 -> System.out.println("🟢 Strong Password");
            case 3 -> System.out.println("🟡 Moderate Password");
            default -> System.out.println("🔴 Weak Password");
        }

        sc.close();
    }
}
