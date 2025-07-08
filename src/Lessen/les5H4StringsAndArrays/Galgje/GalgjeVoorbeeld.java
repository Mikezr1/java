package Lessen.les5H4StringsAndArrays.Galgje;

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

        final int maxLives = 6;

        int lives = maxLives;

        while(lives > 0) {
            System.out.println(Galg.forStage(lives));
            System.out.println(guessedLetters);
            System.out.printf("Je hebt nog %d leven%s over\n", lives, (lives > 1) ? "s" : "");
            System.out.print("Raad een letter: ");

            String input = scanner.next();

            if (input.length() > 1) {
                System.out.println("Helaas mag je maar een letter per keer gebruiken");
                continue;
            }

            char guess = input.toLowerCase().charAt(0);

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
                System.out.println("Je hebt gewonnen, je bent een koning. \uD83D\uDC51 ");
                break;
            }
        }

        System.out.println(Galg.forStage(lives));

        if (lives == 0) {
            System.out.println("Je hebt verloren. \uD83D\uDC80 ");
        }
    }
}