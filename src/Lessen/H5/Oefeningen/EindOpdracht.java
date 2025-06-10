package Lessen.H5.Oefeningen;

/*
Gegeven een invoer van de gebruiker, doe het volgende:
    ○ 1 Print het aantal karakters -> check of iets een letter is en of hoeveel het er zijn.
    ○ 2 Print het aantal woorden dat in de invoer zat
    ○ 3 Print het aantal klinkers (a, e, i, o, u, y)
    ○ 4 Bepaal of de invoer een palindroom is
    ○ 5 Maak een staafdiagram dat weergeeft hoe vaak een bepaalde karakters gezien zijn.

Voorbeeld:
    java eindopgave
    Voer een zin in: nee weg t kaatsnet en staak t geween
    Aantal karakters: 36
    Aantal woorden:   8
    Aantal klinkers:  12
    Palindroom?       True

    * ** ** **
    ***** ***** * * * * * ** * * * * * * * ** * * a b c d e f g h i j k l m n o p qr s t u v w x y z 01 2 3 45 6 7 8 9

*/

public class EindOpdracht {
    public static void main(String[] args) {

        String input = "nee weg t kaatsnet en staak t geween";

        /*1. aantal letters*/
        int charAmount = 0; //buiten de loop zodat je de waarde in de print een keer printen buiten de loop. En het is hier een getal.

        for (int i = 0; i < input.length() ; i++) {//hiermee kan je de code uitvoeren voor alle letters.
            char charCheck = input.charAt(i); //zoekt de letters in de input string, voor elke letter (per iteratie) want hij zit in de loop!

            if (Character.isLetter(charCheck) ) { //wrapper class van char met daarmee de functie wat is een letter hier.
                charAmount++; //hier tel ik per iteratie 1 index getal verder om zo alle karakters af te gaan.
                charAmount += 1; //dit is eigenlijk hetzelfde...
                charAmount -= 1;
            }// hier moeten we checken of het een letter is  en dan moeten alle karakters worden opgeteld bij elkaar.
        }
        System.out.println("Aantal karakters: " + charAmount);

        /* 2. aantal woorden */
        //wat wil ik uit deze berekekning hebben? -> woorden

        String Resultaat = "null";

        //array met woorden gemaakt

        String[] woorden = input.split(" ");  // nu moet je het resultaat in een variabele opslaan // split maak een lijst van woorden en daarom heb je een array nodig.
//        System.out.println(woorden[2]);
        System.out.println("Aantal woorden: " + woorden.length );


        /*3 Print het aantal klinkers (a, e, i, o, u, y)*/

//        ik wil alle chars hebben:
//        char aantalKlinkers = chatAt;

        int klinkers = 0;

        for (int i = 0; i < input.length(); i++) {
            char aantalKlinkers = input.charAt(i);
            if (aantalKlinkers == 'a' || aantalKlinkers == 'e' ||
                    aantalKlinkers == 'i' || aantalKlinkers == 'o' ||
                    aantalKlinkers == 'u' || aantalKlinkers == 'y') {
                klinkers++;
            }
        }
        System.out.println("aantal klinkers: " + klinkers);
//        Deze chars wil ik hebben: a, e, i, o, u, y

        /*4 Bepaal of de invoer een palindroom is (zoals lepel) true/false hint: een zin is ook een palindroom*/
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
//        String reversed = new StringBuilder(processedInput).reverse().toString();
//        boolean isPalindroom = processedInput.equals(reversed);
//        System.out.println("Palindroom? " + isPalindroom);
        System.out.println(processedInput);
//        zin omdraaien in richting + spaties etc weghalen
//            String backwards = input.replaceAll().toLowerCase();

//

        // checken of de string beide kanten op het zelfde is

        //variabele aanmaken voor palindroom woorden -> simpelweg doorgeven met null
//        String palindroomOmgekeerd = "";

        //start met een stringbuilder, hiermee kan je
//        StringBuilder palindroom = new StringBuilder(input); //zin in een stringbuilder zetten
//        String out = palindroom.reverse().toString(); //zin achterste voren en er een string van maken
//        System.out.println(palindroom);
        //reverse van string checken met een for loop, voor elk woord controleren of dit een palindroom is

//        if (out.equals(palindroomOmgekeerd) ) {
//            boolean true;
//        } else {
//            boolean false;
//        }
        //inhoud
//        boolean isPalindroom =
                //logica

        //replace string om spaties eruit te halen en te vervangen voor niks

        /*5 Maak een staafdiagram dat weergeeft hoe vaak een bepaalde karakters gezien zijn.*/

    }
}
