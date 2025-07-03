import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerScore = 0, computerScore = 0;

        while (true) {
            System.out.print("\nChoose Rock, Paper, or Scissors (or type 'exit'): ");
            String player = sc.nextLine().toLowerCase();

            if (player.equals("exit")) break;

            if (!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            String computer = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computer);

            if (player.equals(computer)) {
                System.out.println("It's a tie!");
            } else if (
                (player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))
            ) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }

            System.out.println("Score: You " + playerScore + " - " + computerScore + " Computer");
        }

        sc.close();
    }
}
