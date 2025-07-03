import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        String[] responses = {
            "Yes", "No", "Maybe", "Ask again", "Definitely", "I don't think so"
        };

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.print("Ask a question (or type 'exit'): ");
            String question = sc.nextLine();

            if (question.equalsIgnoreCase("exit")) {
                break;
            }

            int index = rand.nextInt(responses.length);
            System.out.println("Magic 8 Ball says: " + responses[index]);
        }

        sc.close();
    }
}
