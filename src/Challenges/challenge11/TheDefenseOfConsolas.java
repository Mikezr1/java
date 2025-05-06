package Challenges.challenge11;

import java.util.Scanner;
import java.awt.Toolkit;
/*
The Uncoded One has begun an assault on the city of Consolas; the
situation is dire. From a moving airship called the Manticore,
massive fireballs capable of destroying city blocks are being
catapulted into the city.
The city is arranged in blocks, numbered like a chessboard. You can assume its defenders are smart, so they can also move outside the city to say row -1 if needed.
The city’s only defense is a movable magical barrier, operated by a
squad of four that can protect a single city block by putting
themselves in each of the target’s four adjacent blocks, as shown in
the picture to the right.
For example, to protect the city block at (Row 6, Column 5), the
crew deploys themselves to (Row 6, Column 4), (Row 5, Column 5),
(Row 6, Column 6), and (Row 7, Column 5). (you may want to make a sketch of the situation on a piece of paper)

The good news is that if we can compute the deployment locations fast enough, the crew can be
deployed around the target in time to prevent catastrophic damage to the city for as long as the siege
lasts. The City of Consolas needs a program to tell the squad where to deploy, given the anticipated
target. Something like this:

Target Row? 6
Target Column? 5
Deploy to:
(6, 4)
(5, 5)
(6, 6)
(7, 5)
Objectives:
1. Ask the user for the target row and column.
2. Compute the neighboring rows and columns of where to deploy the squad (arround the target row and column).
3. Display the deployment instructions in a different color of your choosing.
4. Play a sound with Toolkit.getDefaultToolkit().beep(); when the results have been computed and displayed.

Notes:
A chessboard has 8 rows/columns.
*/
public class TheDefenseOfConsolas {

    public static final String RESET = "\u001B[0m";
    public static final String GREEN_BG = "\u001B[42m"; // Groene achtergrond
    public static final String ORANGE_TEXT = "\u001B[93m"; // Oranje achtergrond
    public static final String BLUE_TEXT = "\u001B[34m"; // Blauwe tekst
    public static final String BOLD = "\u001b[1m"; //bold text
    public static final String ITALICIZE = "\u001b[3m"; //italicized text
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //1. Targets
        System.out.println(BLUE_TEXT + "What is the target row for your deployement?" + RESET);
        int targetRow = in.nextInt();
        System.out.println(BLUE_TEXT + "What is the target column for your deployement?" + RESET);
        int targetColumn = in.nextInt();
        System.out.println("\n" + ORANGE_TEXT + BOLD + ITALICIZE + "Thanks, your deployement positions are:" + RESET + "\n");
        
        //2. Show all combinations without the target row and column number
        if (targetColumn - 1 >= 0) {
            System.out.println("(" + "row " + (targetRow -1) + ", " + "column " + targetColumn + ")");  // Left
        }
        if (targetColumn - 1 >= 0) {
            System.out.println("(" + "row " + targetRow + ", " + "column " + (targetColumn - 1) + ")");  // Left
        }
        if (targetRow + 1 <= 7) {
            System.out.println("(" + "row " + (targetRow + 1) + ", " + "column " + targetColumn + ")");  // Below
        }
        if (targetColumn + 1 <= 7) {
            System.out.println("(" + "row " + targetRow + ", " + "column " + (targetColumn + 1) + ")");  // Right
        }
        
        //Extra bonus; positon layout on a map
        System.out.println("\n" + ORANGE_TEXT + BOLD + ITALICIZE + "Position layout:" + RESET + "\n");
       
        // Top position (above)
        if (targetRow - 1 >= 0) {
            System.out.printf("    | %d,%d |    \n", targetRow - 1, targetColumn);
        } else {
            System.out.printf("    | -- |    \n");
        }

        System.out.printf("---------------\n");

        // Print left, center, and right positions
        if (targetColumn - 1 >= 0) {
            System.out.printf("%d,%d ", targetRow, targetColumn - 1);
        } else {
            System.out.printf("-- ");
        }

        System.out.printf("| %d,%d |", targetRow, targetColumn); // Center

        if (targetColumn + 1 <= 7) {
            System.out.printf(" %d,%d\n", targetRow, targetColumn + 1);
        } else {
            System.out.printf(" --\n");
        }

        System.out.printf("---------------\n");

        // Bottom position (below)
        if (targetRow + 1 <= 7) {
            System.out.printf("    | %d,%d |    \n", targetRow + 1, targetColumn);
        } else {
            System.out.printf("    | -- |    \n");
        }

        //3. Green background text
        System.out.println("\n" + "Defense system: " + GREEN_BG + "activated" + RESET);
        
        //4. play a sound when results have been computed and displayed
        Toolkit.getDefaultToolkit().beep();
        in.close();
    }
}
