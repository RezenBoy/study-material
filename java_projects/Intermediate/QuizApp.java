import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is 5 + 7?",
            "Which language is used to write Python programs?"
        };

        String[] answers = {"Paris", "Mars", "12", "English"};

        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = sc.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + answers[i] + "\n");
            }
        }

        System.out.println("You scored " + score + "/" + questions.length);
        sc.close();
    }
}
