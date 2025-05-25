package Lessen.les5H4.Galgje;

import java.util.ArrayList;
import java.util.Scanner;

public class GalgjeVoorbeeld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een woord in: ");
        String wordToGuess = scanner.nextLine().toLowerCase();
        ArrayList<Character> allGuessedLetters = new ArrayList<>();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        ArrayList<Character> guessedLetters = new ArrayList<>();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedLetters.add('_');
        }

        int lives = 6;

        while(lives > 0) {
            System.out.println(Galg.forStage(lives));
            System.out.println(guessedLetters);
            System.out.print("Raad een letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (allGuessedLetters.contains(guess)) {
                System.out.println("Deze letter heb je al geraden");
                continue;
            }

            allGuessedLetters.add(guess);

            if (!wordToGuess.contains(String.valueOf(guess))) {
                lives--;
                continue;
            }

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (guess == wordToGuess.charAt(i)) {
                    guessedLetters.set(i, guess);
                }
            }

            if (!guessedLetters.contains('_')) {
                System.out.println("Je hebt gewonnen, je bent een koning.");
                break;
            }

        }

        System.out.println(Galg.forStage(lives));
    }
}