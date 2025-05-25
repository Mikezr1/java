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
Objectives:

√ Build a program that will allow a user, the pilot, to enter a number.
If the number is above 100 or less than 0, keep asking. -> Do while loop!
Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
Ask a second user, the hunter,to guess numbers.
Indicate whether the user guessed too high, too low, or guessed right.
Loop until they get it right, then end the program.
*/

public class ThePrototype {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
//        int pilotInput = scan.nextInt();

        int answer = 5;
        int minRange = 0;
        int maxRange = 100;

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
    }
}
