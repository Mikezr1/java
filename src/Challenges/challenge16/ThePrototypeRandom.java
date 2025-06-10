package Challenges.challenge16;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class ThePrototypeRandom {
    public static void main(String[] args) {

    // Game settings
    final int minNumber = 0;
    final int maxNumber = 100;

    //lijst van 100 getallen
    List<Integer> nummers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
        nummers.add(i);
        }

    Scanner scan = new Scanner(System.in);

    // Kies een willekeurig getal uit de lijst
    Random random = new Random();
    int index = random.nextInt(nummers.size());
    int secretNumber = nummers.get(index);

        System.out.println("Het geheime getal is gekozen! Hunter mag beginnen met raden.\n");

    // Hunter raadt
    int guess;
    int pogingTeller = 0;
        do {
            pogingTeller++;// tel elke poging
        System.out.print("Raad een getal tussen " + minNumber + " en " + maxNumber + ": ");
        guess = scan.nextInt();

        if (guess < minNumber || guess > maxNumber) {
            System.out.println("Dat getal ligt buiten het bereik, probeer opnieuw.");
        } else if (guess < secretNumber) {
            System.out.println("Hoger!");
        } else if (guess > secretNumber) {
            System.out.println("Lager!");
        } else {
            System.out.println("\n" + "Correct! " + guess + " is het juiste getal geraden in" + pogingTeller + "pogingen.");
        }

    } while (guess != secretNumber);

        scan.close();
    }
}
