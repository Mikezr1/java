package Lessen.les5H4StringsAndArrays.Galgje;

import java.util.ArrayList;
import java.util.Scanner;

public class GalgjeVoorbeeldMetUitleg {
    public static void main(String[] args) {
        // Iemand verzint een woord, case insenstive
        // Scanner & printen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een woord in: ");
        String wordToGuess = scanner.nextLine().toLowerCase();
        ArrayList<Character> allGuessedLetters = new ArrayList<>();

        // Console leegmaken
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // _ geradenLetters verzameling
        // Arraylist aanmaken
        // voor elke letter in te raden woord
        // voegen we een underscore aan de arraylist
        ArrayList<Character> guessedLetters = new ArrayList<>();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedLetters.add('_');
        }

        // levens -> getal, je wilt geen magic numbers dus moet je er een extra variabele aan geven.
        final int maxLives = 6;

        int lives = maxLives;

        // Herhalend
        // Als levens op zijn, stoppen met herhalen
        while(lives > 0) {
            // Galgje laten zien
            System.out.println(Galg.forStage(lives));
            // geraden letters tonen
            System.out.println(guessedLetters);
            // De ingevoerde letter mag niet meer dan twee zijn. Met een string format en ternary om te checken hoeveel levens er nog zijn
            System.out.printf("Je hebt nog %d leven%s over\n", lives, (lives > 1) ? "s" : "");

            System.out.print("Raad een letter: ");

            String input = scanner.next();

            if (input.length() > 1) {
                System.out.println("Helaas mag je maar een letter per keer gebruiken");
                continue;
            }

            // Speler 2 gaat raden, ook lowercase
            char guess = input.toLowerCase().charAt(0);

            // niet meerdere keren dezelfde letter raden
            if (allGuessedLetters.contains(guess)) {
                System.out.println("Deze letter heb je al geraden");
                continue;
            }

            allGuessedLetters.add(guess);

            // Als poging niet in woord zit
            if (!wordToGuess.contains(String.valueOf(guess))) {
                // levens aftrekken
                lives--;
                // door naar volgende iteratie
                continue;
            }

            // Kijken waar letter in het woord zit
            for (int i = 0; i < wordToGuess.length(); i++) {
                // Ja? opslaan in geradenLetters
                if (guess == wordToGuess.charAt(i)) {
                    guessedLetters.set(i, guess);
                }
            }

            // Als woord geraden is, stoppen met herhalen
            if (!guessedLetters.contains('_')) {
                // Feedback aan gebruiker, als er geen _ meer over zijn dan heb je gewonnen
                System.out.println("Je hebt gewonnen, je bent een koning. \uD83D\uDC51");
                // Stop met loopen
                break;
            }

        }

        // Feedback speler gewonnen of verloren
        // Galgje laten zien
        System.out.println(Galg.forStage(lives));

        //als de levens op zijn, dan ben je af. dit staat buiten de while loop zodat je eerst door alle levens heen gaat.
        if (lives == 0) {
            System.out.println("Je hebt verloren. \uD83D\uDC80 ");
        }
    }
}

// Niet meerdere keren dezelfde letter raden
