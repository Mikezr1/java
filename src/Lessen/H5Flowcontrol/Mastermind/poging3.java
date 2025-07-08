package Lessen.H5Flowcontrol.Mastermind;

import java.util.ArrayList;
import java.util.Random;

public class poging3 {
    public static void main(String[] args) {
        ArrayList<Colors> codeColors = randomColors();

        System.out.println("Geheime code:");
        for (Colors color : codeColors) {
            System.out.println(color);
        }

        // Haal de gok van de speler op
        ArrayList<Colors> guessColors = playersGuess();

        // Check de positie
        checkPosition(codeColors, guessColors);
    }

    public static ArrayList<Colors> randomColors() {
        ArrayList<Colors> randomColorArray = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            Colors[] colorArray = Colors.values();
            int randomIndex = random.nextInt(colorArray.length);
            Colors randomColor = colorArray[randomIndex];

            randomColorArray.add(randomColor);
        }

        return randomColorArray;
    }

    public static ArrayList<Colors> playersGuess() {
        System.out.println("U mag een van deze kleuren (Black, Yellow, Red, Green, Blue) gebruiken bij uw pogingen");

        // Simuleer spelerinvoer
        String scanForGuess = "black yellow red green";
        String contentGuess = scanForGuess.toUpperCase();

        String[] guessArray = contentGuess.split(" ");
        ArrayList<Colors> guessColors = new ArrayList<>();
        for (String color : guessArray) {
            guessColors.add(Colors.valueOf(color));
        }

        System.out.println("Uw gok: " + guessColors);

        return guessColors;
    }

    public static void checkPosition(ArrayList<Colors> codeColors, ArrayList<Colors> guessColors) {
        for (int i = 0; i < guessColors.size(); i++) {
            Colors guessedColor = guessColors.get(i);
            Colors correctColor = codeColors.get(i);

            if (guessedColor.equals(correctColor)) {
                System.out.println("Positie " + i + " klopt helemaal: " + guessedColor);
            } else if (codeColors.contains(guessedColor)) {
                System.out.println("Positie " + i + " heeft de juiste kleur, maar verkeerde plek: " + guessedColor);
            } else {
                System.out.println("Positie " + i + " is helemaal fout: " + guessedColor);
            }
        }
    }
}