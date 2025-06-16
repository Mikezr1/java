package Challenges.challenge16;

import java.util.Scanner;
/*
Mylara, the captain of the Guard of Consolas, has approached you with the beginnings of a plan to hunt
down The Uncoded One’s airship. “If we’re going to be able to track this thing down,” she says, “we need
you to make us a program that can help us home in on a location.” She lays out a plan for a program to
help with the hunt. One user, representing the airship pilot, picks a number between 0 and 100. Another
user, the hunter, will then attempt to guess the number. The program will tell the hunter that they
guessed correctly or that the number was too high or low. The program repeats until the hunter guesses
the number correctly. Mylara claims, “If we can build this program, we can use what we learn to build a
better version to hunt down the Uncoded One’s airship.”

Sample Program:

User 1, enter a number between 0 and 100: 27
After entering this number, the program should clear the screen and continue like this:
User 2, guess the number.
What is your next guess? 50
50 is too high.
What is your next guess? 25
25 is too low.
What is your next guess? 27
You guessed the number!

Step 1, what do we need in terms of structure and methodes?

class Game (Game logica and Game loop methode, input methode, output methode)
Attributen in de Game klasse
set_target_number methode
guess_number methode
clear_screen methode
amountOfTries methode (optioneel)


Objectives:
√ Build a program that will allow a user, the pilot, to enter a number.
If the number is above 100 or less than 0, keep asking. -> Do while loop!
Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
Ask a second user, the hunter,to guess numbers.
Indicate whether the user guessed too high, too low, or guessed right.
Loop until they get it right, then end the program.

Sub opbjectives:
1.√ setup program
2.√ make a input possible
3. make it only integers
4. make a do while loop
5. test in the while that the number should be 100 - 0 and not higher or negative
5B. test the number size with a boolean
6. clear the screen when the number is correctly added -> maak een for loop die 50 x een \n print
7. write a print with change player to user 2, the hunter
8. Give feedback if the quess was tho high , to low or right -> if formules binnen de do while loop
9. Loop untill 50 tries, or till they get it right -> make a counter that counts the tries/guesses
10. congrats the user with the defeat or win. ->
10. end program
*/
public class ThePrototype1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //1.setup program with a scope of 1-100

        //Game settings
        final int minNumber = 0; //2. make it only integers

        final int maxNumber = 100;


//        int checkedInput =

        //3. pilot gives secret number -> make a input possible between 1-100
        System.out.println("Hi Pilot, What number can the hunter guess?");

        int numberToGuess = scan.nextInt();

        //4. Maak een input methode, waarbij deze methode blijft doorvragen tot de input geldig is
        while (true) {
           boolean checked = (numberToGuess > minNumber && numberToGuess <= maxNumber);

            if (checked) {
                System.out.println(numberToGuess + " is goedgekeurd");
                System.out.println("Thanks, Hunter can you come forward please?\n");
                break; // stop de loop
            } else {
                System.out.println("The number you have entered is out of reach, please try a number of 0 - 100");
            }
        }

//        5. hunter gaat raden -> Blijf dooraden totdat het getal geraden is
        int guess;
        int secretNumber = numberToGuess;
        int pogingTeller = 0;
        int maxPogingTeller = 10;

        //6. make a do while loop
        do {
            System.out.println("Hunter, what number do you have in mind?");
            System.out.print("Raad een getal tussen " + minNumber + " en " + maxNumber + ": ");
            guess = scan.nextInt();

            if (guess < minNumber || guess > maxNumber) {
                System.out.println("Dat getal ligt buiten het bereik, probeer opnieuw.");
                break;
            } else if (guess < secretNumber ) {
                System.out.println("Hoger! Je hebt nog " + (maxPogingTeller - pogingTeller) + " pogingen");
            } else if (guess > secretNumber) {
                System.out.println("Lager! Je hebt nog " + (maxPogingTeller - pogingTeller) + " pogingen");
            } else {
                System.out.println("\n Correct! " + guess + " is het juiste getal geraden in" + pogingTeller + " pogingen.");
            }

        } while (guess != secretNumber && pogingTeller < maxPogingTeller);         //5. test in the while that the number should be 100 - 0 and not higher or negative

        //Verloren
        if (guess != secretNumber && pogingTeller < maxPogingTeller) {
            System.out.println("Je hebt verloren, je hebt" + maxPogingTeller + " pogingen gehad. Het juiste antwoordt was" + secretNumber );
        }



//        als niet checkt uit de functie stappen met return. dat scheelt haakjes

//        System.out.println(guess);



//        do {
//
//        }
//        while() {
//
//        }

        //6. clear the screen when the number is correctly added

        //7. write a print with change player to user 2, the hunter

        //8. Give feedback if the quess was tho high , to low or right

        //9. Loop untill 50 tries, or till they get it right

        //10. end program
    }
}


//
//int pilotInput = scan.nextInt();
//
//int answer = 5;
//int minRange = 0;
//int maxRange = 100;
//
//        System.out.println("geef een nummer");
//        int pilotInput = scan.nextInt();
//
//        while (pilotInput < minRange || pilotInput >= maxRange ) {
//            System.out.println("blijf raden");
//            pilotInput = scan.nextInt();
//
//        } if (pilotInput <= maxRange) {
//            System.out.println("correct geraden");
//
//        }



//        for (int i = 0; i < maxRange ; i++) {
//            do {
//                System.out.println("Blijf raden");
//                pilotInput = scan.nextInt();
//            }
//
//            while ( pilotInput != answer) {
//                System.out.println("Getal is goed");
//            }
//        }

//        else (pilotInput >= minRange && pilotInput <= maxRange) {
//            System.out.println("Getal is goed");
//        }
