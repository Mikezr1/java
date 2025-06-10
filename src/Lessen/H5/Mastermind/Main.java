package Lessen.H5.Mastermind;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String code = generateRandomLetters(4); // de code van 4 letters
        String code = "bwyr";
        Scanner scanner = new Scanner(System.in);
        boolean gewonnen = false;
        int maxBeurten = 10;
        int beurt = 1;

        System.out.println("Welkom bij Mastermind!");
        System.out.println("Raad de juiste combinatie van 4 letters (b, w, y, r, g).");

        while (!gewonnen && beurt <= maxBeurten) {
            System.out.println("Beurt " + beurt + ": Voer vier letters in:");
            String invoer = scanner.nextLine().toLowerCase();

            if (invoer.length() != 4) {
                System.out.println("De invoer moet precies 4 letters lang zijn.");
                continue;
            }
            // for loop om te checken of elke geraden letter in de letters staat en of ze op de juiste index staan.string builder en for loop?



            if (!invoer.matches("[bwyrg]{4}")) {
                System.out.println("Gebruik alleen de letters b, w, y, r of g.");
                continue;
            }

            if (invoer.equals(code)) {
                gewonnen = true;
                System.out.println("Gefeliciteerd! Je hebt de code geraden: " + code);
            } else {
                System.out.println("Niet juist. Probeer opnieuw.");
                beurt++;
//                feedback naar speler toe

//                stappen -> stap voor stap ->


                //todo code gebruikt en

//                System.out.println(codeGebruikt.toString());
//                System.out.println(juisteLetter);
//                System.out.println(invoerGebruikt.toString());
//                System.out.println(juist);

            }

            //BONUS: visueele geschiedenis
//
        }

        if (!gewonnen) {
            System.out.println("Helaas, je hebt niet gewonnen. De juiste code was: " + code);
        }


        scanner.close();
    }

    public static String generateRandomLetters(int length) {
        String letters = "bwyrg"; // unieke kleurenletters
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(letters.length());
            result.append(letters.charAt(index));
        }

        return result.toString();
    }


}