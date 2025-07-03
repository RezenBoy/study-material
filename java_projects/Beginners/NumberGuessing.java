import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(20) + 1;
        int attempts = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 20:");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("🎉 Correct! You guessed it!");
                break;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Game Over! The number was " + number);
        }

        sc.close();
    }
}
