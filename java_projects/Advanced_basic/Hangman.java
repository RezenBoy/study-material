import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"python", "programming", "hangman", "challenge", "student"};
        String word = words[new Random().nextInt(words.length)];
        char[] guessed = new char[word.length()];
        Arrays.fill(guessed, '_');
        List<Character> guessedLetters = new ArrayList<>();

        int tries = 6;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");

        while (tries > 0 && new String(guessed).contains("_")) {
            System.out.println("\nWord: " + String.valueOf(guessed));
            System.out.println("Tries left: " + tries);
            System.out.print("Guess a letter: ");
            char ch = sc.next().toLowerCase().charAt(0);

            if (guessedLetters.contains(ch)) {
                System.out.println("⚠️ Already guessed!");
                continue;
            }

            guessedLetters.add(ch);
            boolean found = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    guessed[i] = ch;
                    found = true;
                }
            }

            if (found) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
                tries--;
            }
        }

        if (!new String(guessed).contains("_")) {
            System.out.println("\nYou guessed it: " + word);
        } else {
            System.out.println("\nYou lost! The word was: " + word);
        }

        sc.close();
    }
}
