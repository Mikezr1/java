package Challenges.challenge16.ThePrototype;

//Dit is de klasse die de spelregels en logica bevat. Hier roep je ook Players aan.
//GuessingGame bevat de logica (welke speler doet wat, wie wint, enz.)


import java.util.Scanner;

public class GuessingGame {

//        Maak een object aan om 1 spel te laden
        //  GuessingGame is de naam van een klasse die jij zelf hebt gemaakt in je bestand GuessingGame.java
//        De waarde van game is een referentie (adres) naar het object dat in de heap is aangemaakt met new GuessingGame().
        // game is een variabele die in de stack wordt opgeslagen omdat het een lokale variabele is binnen de main methode.

        //klass + variabele naam = object guessingmode aanmaken
//        guessingGame game = new guessingGame();

        //    opslaan van target number
        private int targetNumber;
        private final Scanner input = new Scanner(System.in);


        public void setTargetNumber() {         //set targetNumber methode
            /* int targetNumber = input.nextInt(); */
            do {
                System.out.println("what should the target number be, between 0 and 100?");
                targetNumber = input.nextInt();
            } while (targetNumber < 0 || targetNumber > 100);
            System.out.println("The target number has been set on: " + targetNumber);
//            input.close();
        }

        // StartGuessing methode
        public int guess() {
            System.out.println("What would you like to guess? It should be between 0 and a 100");
            return input.nextInt(); //Waarom hoef ik hier geen input.nextInt(); te koppelen aan guess? bij targetNumber heb ik dat wel ->
            // targetNumber heb je nodig in een vergelijking en daar sla je dus een getal op vanuit de scanner en bij guess verandert het getal per guess.
        }

        //Game logica and Game loop methode, input methode, output methode
        public void gameLoop() {
            int targetGuess;

            do{
                targetGuess = guess();

                if (targetGuess < targetNumber ) {
                 System.out.println("Your guess is to low");
             } else if (targetGuess > targetNumber ) {
                     System.out.println("Your guess is to high");
             } else {
                 System.out.println("Correct!");
             }
            }
            while (targetGuess != targetNumber);
        }

        //clear screen methode
        public void clearScreen() {
            for (int i = 0; i < 50 ; i++) {
                System.out.println();
            }
        }
    }

