package Lessen.les5H4.Galgje;


/*1. Lees het input woord van de gebruiker.*/
//2. Maak een ArrayList<Character> zo lang als de lengte van het woord,
// met alleen onderstrepingstekens '_'. Dit vertegenwoordigt de letters die momenteel door de gebruiker worden geraden.
// Wanneer een gebruiker een letter in een woord raadt, wordt de schatting bijgewerkt en worden letters weergegeven die met succes zijn geraden.
//3. Zolang het woord nog niet geraden is:
//a. vraag de gebruiker om een teken.
//b. update de huidige schatting met de geraden letters in woord.
//c. druk de nieuwe schatting af.
//4. Zodra iemand het woord heeft geraden of het aantal beurten voorbij zijn stopt


import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Galgje {
    public static void main(String[] args) {
        //1 welk woord moet worden geraden?
        Scanner scan = new Scanner(System.in);
        System.out.println("Welke woord moet worden geraden?");
//        String input = scan.nextLine();

        //2 maak een arraylist met streepjes voor elke char, zo lang als het woord dat wordt ingevoerd.
        String teradenWoord = scan.nextLine();

        ArrayList<Character> quess = new ArrayList<>();

        for (int i = 0; i < teradenWoord.length(); i++) {
            quess.add('_'); //geeft een array [_,_,_,]
        }

        //data type : verzameling
        for (char tekenVoorElkeLetter : quess){
            System.out.print(tekenVoorElkeLetter);
        }

        //----- start while loop

        while (true) {

        //3 raad een letter, is het juist onthoudt de letter, de letters mogen dynamisch geraden worden.

        System.out.println("\n" + "Welke letter raad je?");
        char letterPoging = scan.next().charAt(0);


        //Past deze letter in het woord?
//            Boolean isGuessed = false;

            for (int i = 0; i < teradenWoord.length(); i++) {
            if(teradenWoord.charAt(i) == letterPoging){
                quess.set(i, letterPoging);
//                isGuessed = true;
            }

//                if (!isGuessed) {
//
//                }
        }

            //hier kan niet een else in want: een letter fout in defor loop zou dan alle letters fout rekenen gelijk.

//        else {
//                System.out.println("fout");
//            }

        //past de letter er niet in? Print fout en geef een minpunt aan de user.

        //tel de min punten op en

        //4 geef de letters weer die goed zijn

        //5 blijf doorgaan tot alle letters geraden zijn.

        for (char matchedLetter : quess) { //matchedLetter is een nieuwe 'jojo', quess is een verzameling van alle geraden letters
            System.out.print(matchedLetter);
        }
        if (!quess.contains('_')) {
            System.out.println("Je hebt gewonnen!");
            Toolkit.getDefaultToolkit().beep();
            break; //stop while loop als alles geraden is
        }
        }
        //---- einde while loop

        //Galg poppetje
        String[] hangman = {"""
  +---+
  |   |
      |
      |
      |
      |
=========""", """
  +---+
  |   |
  O   |
      |
      |
      |
=========""", """
  +---+
  |   |
  O   |
  |   |
      |
      |
=========""", """
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========""", """
  +---+
  |   |
  O   |
 /|\\  |
      |
      |
=========""", """
  +---+
  |   |
  O   |
 /|\\  |
 /    |
      |
=========""", """
  +---+
  |   |
  O   |
 /|\\  |
 / \\  |
      |
========="""};




        //5 limiteer de pogingen op 10 rondes (for loop limiteren op 10)

        //Welke letter is geraden en mag weergegeven worden?

        //        if (input.length() == 1 && Character.isLetter(input.charAt(0)))
//            char input = input.charAt();


//        //raad een letter
//
//        //maak een array met chars van deze string
//
//        //controlleer of de array een letter bevat vanuit de input en sla dit op
//        if (input equals )
    }
}


