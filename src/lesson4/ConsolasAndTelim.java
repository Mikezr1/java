// TAGS Scanner, Scanner.next(), System.in, System.out.println()

// DESCRIPTIOConsolasAndTelim
// From RB Whitaker's "C# Player's Guide" - adjusted to Java

// Consolas and Telim
// These lands have not seen Programming in a long time due to the blight of the Uncoded
// One. Even old programs are now crumbling to bits. Your skills with Programming are
// only fledgling now, but you can still make a difference in these people's lives. Maybe
// someday soon, your skills will have grown strong enough to take on the Uncoded One
// directly. But for now, you decide to do what you can to help. In the nearby city of
// Consolas, food is running short.Telim has a magic oven that can produce bread from
// thin air. He is willing to share, but Telim is an Excelian, and Excelians love
// paperwork; they demand it for all transactions—no exceptions. Telim will share his
// bread with the city if you can build a program that lets him enter the names of those
// receiving it.

// A sample run of this program looks like this:
// Bread is ready.
// Who is the bread for?
// RB
// Noted: RB got bread.

// Objectives:
// Make a program that runs as shown above, including taking a name from the user
//

// Duration:
// It took me about 30-45 minutes to figure out all inner workings


package lesson4;

import java.util.Scanner;

public class ConsolasAndTelim {
    public static void main(String[] args) {
        System.out.println("Bread is ready.");
        System.out.println("Who is the bread for?");
        Scanner in = new Scanner(System.in); // This is my scanner object to find the owner of the bread
        String recipient = in.next();
        System.out.println("Noted: " + recipient + " one bread is waiting for you."); // This is the reaction the question who's got the bread
    }
}
