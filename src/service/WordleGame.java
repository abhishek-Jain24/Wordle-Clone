package service;

import model.Guess;
import model.LetterStatus;
import model.Word;
import util.InputUtil;
import util.WordUtil;

public class WordleGame implements WordUtil {

    private static final int MAX_ATTEMPTS = 6;

    private final Word secret;

    public WordleGame(Word secret) {
        this.secret = secret;
    }

    @Override
    public LetterStatus[] evaluate(String guess, Word secret) {
        LetterStatus[] statuses = new LetterStatus[5];
        

        guess = guess.toUpperCase();
        for (int i = 0; i < 5; i++) {
            char letter = guess.charAt(i);

            if (secret.isCorrectPosition(letter, i)) {
                statuses[i] = LetterStatus.GREEN;
            } else if (secret.contains(letter)) {
                statuses[i] = LetterStatus.YELLOW;
            } else {
                statuses[i] = LetterStatus.GREY;
            }
        }

        return statuses;
    }

    // Rules display
    private void showRules() {
        System.out.println("\n=== HOW TO PLAY ===");
        System.out.println("1. Guess the 5-letter word");
        System.out.println("2. You have 6 attempts");
        System.out.println("3. Color feedback:");
        System.out.println("   Green  - Correct letter, correct position");
        System.out.println("   Yellow - Correct letter, wrong position");
        System.out.println("   Grey   - Letter not in word");
        System.out.println("===================\n");
    }



   //Starting
    public void start() {
        System.out.println("=== WORDLE ===");
        System.out.println("Guess the 5-letter word in 6 attempts!");

        showRules(); 

        int attempt = 1;

        while (attempt <= MAX_ATTEMPTS) {
            System.out.println("\nAttempt " + attempt + "/" + MAX_ATTEMPTS);

            String input = InputUtil.readLine("Enter 5-letter word: ");
            input = input.toUpperCase();

            if (input.length() != 5) {
                System.out.println("Word must be 5 letters!");
                continue;
            }

            LetterStatus[] statuses = evaluate(input, secret);
            Guess guess = new Guess(input, statuses);
            guess.display();

            if (guess.isCorrect()) {
                 System.out.println("\n=========================");
                System.out.println("     CONGRATULATIONS!    ");
                System.out.println("=========================");
                System.out.println("\nYou won in " + attempt + " attempts!");
                return;
            }

            attempt++;
        }
        
        System.out.println("\n=========================");
        System.out.println("        YOU LOSE!      ");
        System.out.println("=========================");
        System.out.println("\nGame Over! The word was: " + secret.getValue());
        System.out.println("Better luck next time!");
        System.out.println("=========================");
    }
}