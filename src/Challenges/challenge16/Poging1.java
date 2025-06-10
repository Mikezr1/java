package Challenges.challenge16;

import java.util.Scanner;

public class Poging1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //Game settings
        final int minNumber = 0;
        final int maxNumber = 100;

        Scanner inputToGuess = new Scanner(System.in);
        int numberToGuess = scan.nextInt();
        boolean checked = (numberToGuess > minNumber & numberToGuess <= maxNumber );
        if (checked) {
            System.out.println(numberToGuess + "is goedgekeurd");
            System.out.println("Thanks, Hunter can you come forward please?\n");
            System.out.println("Hunter, what number do you have in mind?");
        }
        if (!checked) {
            System.out.println("The number you have entered is out of reach, please try a number of 0 - 100");
            scan.nextInt();
        }
    }
}
